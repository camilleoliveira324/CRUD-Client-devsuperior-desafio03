package com.devsuperior.clientesCrud.dto;

public class FieldMessage {

    private String fieldName;
    private String message;

    public FieldMessage(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getFieldName() {
        return fieldName;
    }
}
