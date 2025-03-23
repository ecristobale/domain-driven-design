package com.ecristobale.domain.tour_domain.domain.services;

import com.ecristobale.domain.tour_domain.domain.models.Tour;
import com.ecristobale.domain.tour_domain.infrastructure.dtos.FlightDTO;
import com.ecristobale.domain.tour_domain.infrastructure.dtos.HotelBookingDTO;
import lombok.extern.java.Log;

public interface TourDomainService {

    Tour createTour(String tourName);

    void addFlightToTour(String tourId, String flightId);

    void addHotelBookingToTour(String tourId, String hotelId);

    void removeFlightFromTour(String tourId, String flightId);

    void removeHotelBookingFromTour(String tourId, String hotelId);

    HotelBookingDTO getHotel(String hotelId);

    FlightDTO getFlight(String flightId);
}
