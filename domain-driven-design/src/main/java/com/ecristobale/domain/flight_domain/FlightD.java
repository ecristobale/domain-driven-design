package com.ecristobale.domain.flight_domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class FlightD {

    private String flightNumber;
    private String origin;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private List<PlaneSeatD> seats;
    private String airline;

    // DDD Ubiquitous language must be reflected in code, so we use the same terms as in the domain methods

    public void changeDepartureTime(LocalDateTime newTime) {
        this.setDepartureTime(newTime);
    }

    public void changeArrivalTime(LocalDateTime newTime) {
        this.setArrivalTime(newTime);
    }

    public List<PlaneSeatD> getAvailableSeats() {
        return this.getSeats().stream().filter(PlaneSeatD::isAvailable).toList();
    }

    public void addSeat(PlaneSeatD seat) {
        if(Objects.isNull(seats)) {
            this.seats = new ArrayList<>();
        }
        this.seats.add(seat);
    }
}
