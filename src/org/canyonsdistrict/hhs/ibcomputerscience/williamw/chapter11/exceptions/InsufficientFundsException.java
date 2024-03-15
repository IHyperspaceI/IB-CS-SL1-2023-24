package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter11.exceptions;

public class InsufficientFundsException extends IllegalArgumentException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
