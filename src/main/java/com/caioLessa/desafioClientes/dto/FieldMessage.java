package com.caioLessa.desafioClientes.dto;

public class FieldMessage {
    private String name;
    private String message;

    public FieldMessage(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String messag) {
        this.message = message;
    }
}
