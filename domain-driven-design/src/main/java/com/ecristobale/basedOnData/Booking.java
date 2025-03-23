package com.ecristobale.basedOnData;

import lombok.Data;
import java.time.LocalDate;

@Data
public class Booking {
    private Long id;
    private Long customerId;
    private Hotel hotel;
    private Room room;
    private double price; // Calculated as:  room.getPrice() + taxRate
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String status;
}
