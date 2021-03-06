package com.company.exchange.services.dataproviders;

public class DataRetrievalException extends Exception {
    public DataRetrievalException() {
        super();
    }

    public DataRetrievalException(String message) {
        super(message);
    }

    public DataRetrievalException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataRetrievalException(Throwable cause) {
        super(cause);
    }
}
