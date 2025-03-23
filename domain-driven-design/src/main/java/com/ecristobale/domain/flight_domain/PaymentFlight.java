package com.ecristobale.domain.flight_domain;

import lombok.Data;

@Data
public class PaymentFlight {

    private String paymentMethod;
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String securityCode;
    private String visaId;
    private String flightDiscount;

    public boolean validatePaymentDetails() {
        // TO DO valid business logic based on flight domain
        return true;
    }
}
