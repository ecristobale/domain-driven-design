package com.ecristobale.basedOnData;

import com.ecristobale.commons.RoomSize;
import lombok.Data;

@Data
public class Room {
    private Long id;
    private int roomNumber;
    private double price;
    private RoomSize size;
    private boolean isAssigned;
    private int floor;
    private String bedType;
}
