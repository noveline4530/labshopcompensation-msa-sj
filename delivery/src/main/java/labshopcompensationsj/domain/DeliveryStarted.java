package labshopcompensationsj.domain;

import java.time.LocalDate;
import java.util.*;
import labshopcompensationsj.domain.*;
import labshopcompensationsj.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String address;
    private String customerId;
    private Integer quantity;

    public DeliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
