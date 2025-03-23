package com.ecristobale.domaindrivendesign;

import com.ecristobale.domain.tour_domain.domain.models.Tour;
import com.ecristobale.domain.tour_domain.domain.services.TourDomainServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DomainDrivenDesignExerciseApplication {

	public static void main(String[] args) {

		final var tourService = new TourDomainServiceImpl();

		// Create new tour
		Tour tour = tourService.createTour("European Adventure");

		// Add flights to the tour
		tourService.addFlightToTour(tour, "1");
		tourService.addFlightToTour(tour, "2");

		// Add hotel bookings to the tour
		tourService.addHotelBookingToTour(tour, "101");
		tourService.addHotelBookingToTour(tour, "102");

		// Show the total cost of the tour
		double totalCost = tour.getTotalCost();
		System.out.println("Total cost of the tour: " + totalCost + "€");

		// Remove a flight from the tour
		tourService.removeFlightFromTour(tour, "1");

		// Remove a hotel booking from the tour
		tourService.removeHotelBookingFromTour(tour, "101");

		// Show the updated total cost of the tour
		totalCost = tour.getTotalCost();
		System.out.println("Updated total cost of the tour: " + totalCost + "€");
	}

}
