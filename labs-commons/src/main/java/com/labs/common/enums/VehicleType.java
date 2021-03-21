package com.labs.common.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum VehicleType {

    CAR("Car"),
    SUV("SUV"),
    TRUCK_W3("3 Wheel truck"),
    TRUCK_W6("6 wheel truck"),
    MOTORBIKE("Motorbike");

    private String value;

    VehicleType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
