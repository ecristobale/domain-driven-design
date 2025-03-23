package com.ecristobale.domain.hotel_domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class RoomD {

    private Long id;
    private int roomNumber;
    private double price;
    private boolean isAssigned;
    private String bedType;
    private List<String> amenities;

    public void changePrice(double newPrice) {
        this.setPrice(newPrice);
    }

    public void addAmenities(List<String> newAmenities) {
        if(Objects.isNull(this.amenities)) {
            this.amenities = new ArrayList<>();
            return;
        }
        this.getAmenities().addAll(newAmenities);
    }

    public boolean isAssigned() {
        return !this.isAssigned;
    }
}
