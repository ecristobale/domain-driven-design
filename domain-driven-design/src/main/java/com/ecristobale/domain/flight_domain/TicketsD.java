package com.ecristobale.domain.flight_domain;

import com.ecristobale.basedOnData.Flight;
import com.ecristobale.basedOnData.PlaneSeat;
import lombok.Data;

@Data
public class TicketsD {
    private Long id;
    private Long customerId;
    private Flight flight;
    private PlaneSeat seat;
    private double price; // seat.getPrice() + taxes
    private String ticketNumber;
}
