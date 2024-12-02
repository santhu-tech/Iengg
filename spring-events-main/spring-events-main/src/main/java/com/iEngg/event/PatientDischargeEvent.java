package com.iEngg.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ApplicationEventMulticaster;

@Getter
@Setter

//ApplicationEventMulticaster  -->Synchronous Customization event triggers
public class PatientDischargeEvent extends ApplicationEvent {

    private String patientId;
    private String patientName;

    public PatientDischargeEvent(Object source,String patientId,String patientName) {
        super(source);
        this.patientId=patientId;
        this.patientName=patientName;
    }
}
