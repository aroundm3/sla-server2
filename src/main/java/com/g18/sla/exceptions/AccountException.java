package com.g18.sla.exceptions;

public class AccountException extends RuntimeException{
    public AccountException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public AccountException(String exMessage) {
        super(exMessage);
    }
}
