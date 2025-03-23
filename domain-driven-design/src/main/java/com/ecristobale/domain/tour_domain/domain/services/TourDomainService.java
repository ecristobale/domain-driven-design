package com.ecristobale.domain.tour_domain.domain.services;

import com.ecristobale.domain.tour_domain.domain.models.Tour;
import com.ecristobale.domain.tour_domain.infrastructure.dtos.FlightDTO;
import com.ecristobale.domain.tour_domain.infrastructure.dtos.HotelBookingDTO;
import lombok.extern.java.Log;

public interface TourDomainService {

    Tour createTour(String tourName);

    void addFlightToTour(Tour tour, String flightId);

    void addHotelBookingToTour(Tour tour, String hotelId);

    void removeFlightFromTour(Tour tour, String flightId);

    void removeHotelBookingFromTour(Tour tour, String hotelId);

}
