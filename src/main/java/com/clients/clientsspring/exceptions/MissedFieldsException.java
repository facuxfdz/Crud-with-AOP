package com.clients.clientsspring.exceptions;

public class MissedFieldsException extends Exception {
    
    public MissedFieldsException(String error){
        super(error);
    }
}
