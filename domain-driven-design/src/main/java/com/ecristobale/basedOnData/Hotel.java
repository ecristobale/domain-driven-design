package com.ecristobale.basedOnData;

import lombok.Data;
import java.util.List;

@Data
public class Hotel {
    private Long id;
    private String name;
    private String address;
    private int rating;
    private int numberOfRooms;
    private List<Room> rooms;
    private String phoneNumber;
    private String email;
}
