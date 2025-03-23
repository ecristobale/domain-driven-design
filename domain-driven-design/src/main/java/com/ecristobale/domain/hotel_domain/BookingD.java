package com.ecristobale.domain.hotel_domain;

import com.ecristobale.basedOnData.Hotel;
import com.ecristobale.basedOnData.Room;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingD {
    private Long id;
    private Long customerId;
    private Hotel hotel;
    private Room room;
    private double price; // room.getPrice() + taxRate
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public void calculatePrice(double taxRate) {
        final var roomPrice = this.room.getPrice();
        this.setPrice(room.getPrice() + taxRate);
    }

    public void changeCheckInDate(LocalDate newCheckInDate) {
        this.setCheckInDate(newCheckInDate);
    }

    public void changeCheckOutDate(LocalDate newCheckOutDate) {
        this.setCheckOutDate(newCheckOutDate);
    }
}
