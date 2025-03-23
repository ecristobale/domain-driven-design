package com.ecristobale.basedOnData;

import lombok.Data;

@Data
public class Ticket {
    private Long id;
    private Long customerId;
    private Flight flight;
    private PlaneSeat seat;
    private double price; // Calculated as:  seat.getPrice() + taxes
    private String status;
    private String ticketNumber;
}
