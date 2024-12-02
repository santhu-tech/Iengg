package com.iEngg.handler;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.iEngg.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BillingServiceHandler {

    @EventListener
    @Async
    public void processBill(PatientDischargeEvent patientDischargeEvent) {
        // Finalize billing details
        System.out.println("Billing Service: Finalizing bill for patient "
                +patientDischargeEvent.getPatientId()+" : "+Thread.currentThread().getName());
    }
}
