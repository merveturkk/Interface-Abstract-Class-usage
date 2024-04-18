package com.merveturk.oop.inheritance;

import com.merveturk.oop.encapsulation.Car;

public class Volvo extends Car {

    private String safetyProperty;
    private String wheelProperty;

    public void infoVolvo ()
    {
        System.out.println("This is a volvo");
    }

    public String getSafetyProperty() {
        return safetyProperty;
    }

    public void setSafetyProperty(String safetyProperty) {
        this.safetyProperty = safetyProperty;
    }

    public String getWheelProperty() {
        return wheelProperty;
    }

    public void setWheelProperty(String wheelProperty) {
        this.wheelProperty = wheelProperty;
    }
}
