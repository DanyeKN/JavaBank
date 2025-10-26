package br.com.dio.expection;

public class NotFoundEnoughException extends RuntimeException {

    public NotFoundEnoughException(String message) {
        super(message);
    }
    
}
