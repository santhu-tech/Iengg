package com.iEngg.dto;

import com.iEngg.entity.Product;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductEvent {

    private String eventType;
    private Product product;
}
