package org.exceptionly.demo.service;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

/**
 * A bean consuming data from the "prices" Kafka topic and applying some conversion.
 * The result is set to LATEST_PRICE
 */
@ApplicationScoped
public class PriceConverter {

    private static final double CONVERSION_RATE = 0.98;
    private static double LATEST_PRICE = 0.00;

    @Incoming("prices")
    public void process(int priceInUsd) {
        LATEST_PRICE = priceInUsd * CONVERSION_RATE;
    }

    public double price() {
        return LATEST_PRICE;
    }

}