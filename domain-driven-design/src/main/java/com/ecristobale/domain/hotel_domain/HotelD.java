package com.ecristobale.domain.hotel_domain;

import com.ecristobale.domain.flight_domain.PlaneSeatD;
import lombok.Data;

import java.util.List;

@Data
public class HotelD {
    private Long id;
    private String name;
    private String address;
    private int rating;
    private List<RoomD> rooms;

    public void changeRating(int newRating) {
        this.setRating(newRating);
    }

    public List<RoomD> getAvailableRooms() {
        return this.getRooms().stream().filter(r -> !r.isAssigned()).toList();
    }
}
