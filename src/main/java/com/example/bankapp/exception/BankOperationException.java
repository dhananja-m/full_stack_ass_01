package com.example.bankapp.exception;

public class BankOperationException extends RuntimeException {
    public BankOperationException(String message) {
        super(message);
    }
}