package com.ecristobale.domain.tour_domain.infrastructure.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlightDTO {
    private Long id;
    private String flightNumber;
    private String origin;
    private String destination;
    private double price;
    private String airline;
}
