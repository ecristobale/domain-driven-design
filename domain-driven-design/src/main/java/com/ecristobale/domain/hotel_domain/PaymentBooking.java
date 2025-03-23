package com.ecristobale.domain.hotel_domain;

import lombok.Data;

@Data
public class PaymentBooking { // It would be named Payment if the domains where separated projects

    private String paymentMethod;
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String securityCode;
    private String bookingDiscount;

    public boolean validatePaymentDetails() {
        // TO DO valid business logic based on hotel domain
        return true;
    }
}
