package com.ecristobale.domain.tour_domain.domain.services;

import com.ecristobale.domain.tour_domain.domain.models.Tour;
import com.ecristobale.domain.tour_domain.infrastructure.dtos.FlightDTO;
import com.ecristobale.domain.tour_domain.infrastructure.dtos.HotelBookingDTO;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;

@Log
//@Component
public class TourDomainServiceImpl implements TourDomainService {

    //(WebClients)
    //@Autowired clientHttpHotel
    //@Autowired clientHttpFlight

    @Override
    public Tour createTour(String tourName) {
        return null;
    }

    @Override
    public void addFlightToTour(String tourId, String flightId) {

    }

    @Override
    public void addHotelBookingToTour(String tourId, String hotelId) {

    }

    @Override
    public void removeFlightFromTour(String tourId, String flightId) {

    }

    @Override
    public void removeHotelBookingFromTour(String tourId, String hotelId) {

    }

    @Override
    public HotelBookingDTO getHotel(String hotelId) {
        return null;
    }

    @Override
    public FlightDTO getFlight(String flightId) {
        return null;
    }

    /**
     * HTTP call to Flight domain
     */
    private List<FlightDTO> createDummyFlights() {
        List<FlightDTO> flights = new ArrayList<>();

        flights.add(FlightDTO.builder()
                .id(1L)
                .flightNumber("FN123")
                .origin("Madrid")
                .destination("Munich")
                .price(500.0)
                .airline("Iberia")
                .build());

        flights.add(FlightDTO.builder()
                .id(2L)
                .flightNumber("FL216")
                .origin("London")
                .destination("Barcelona")
                .price(600.0)
                .airline("British Airways")
                .build());

        return flights;
    }

    /**
     * HTTP call to Hotel domain
     */
    private List<HotelBookingDTO> createDummyHotelBookings() {
        List<HotelBookingDTO> hotelBookings = new ArrayList<>();

        hotelBookings.add(HotelBookingDTO.builder()
                .id(101L)
                .hotelName("Grand Plaza")
                .address("123 Main Street")
                .price(200.0)
                .rating(5)
                .build());

        hotelBookings.add(HotelBookingDTO.builder()
                .id(102L)
                .hotelName("Royal Suites")
                .address("456 Broadway")
                .price(300.0)
                .rating(4)
                .build());

        return hotelBookings;
    }
}
