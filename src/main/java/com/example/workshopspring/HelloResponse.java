package com.example.workshopspring;

public class HelloResponse {
    private String message;

    public HelloResponse(String message ) {
        this.message = "Hello " + message ;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
