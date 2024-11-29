package com.iEngg.service;

import com.iEngg.dto.enums.OrderStatus;
import com.iEngg.dto.request.OrderRequest;
import com.iEngg.dto.response.OrderResponse;
import com.iEngg.entity.OrderEvent;
import com.iEngg.publisher.OrderEventKafkaPublisher;
import com.iEngg.repository.OrderEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    private OrderEventRepository repository;

    @Autowired
    private OrderEventKafkaPublisher publisher;


    // Handle order creation
    public OrderResponse placeAnOrder(OrderRequest orderRequest) {
        String orderId = UUID.randomUUID().toString().split("-")[0];
        orderRequest.setOrderId(orderId);
        //do request validation and real business logic
        //save that event and publish kafka messages
        OrderEvent orderEvent=new OrderEvent(orderId,OrderStatus.CREATED,"Order created successfully", LocalDateTime.now());
        saveAndPublishEvents(orderEvent);
        return new OrderResponse(orderId, OrderStatus.CREATED);
    }

    // Handle order confirmation
    public OrderResponse confirmOrder(String orderId) {
        OrderEvent orderEvent=new OrderEvent(orderId,OrderStatus.CONFIRMED,"Order confirmed successfully", LocalDateTime.now());
        saveAndPublishEvents(orderEvent);
        return new OrderResponse(orderId, OrderStatus.CONFIRMED);
    }

    private void saveAndPublishEvents(OrderEvent orderEvent){
        repository.save(orderEvent);
        publisher.sendOrderEvent(orderEvent);
    }


}
