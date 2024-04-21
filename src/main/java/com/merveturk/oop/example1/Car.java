package com.merveturk.oop.example1;

public class Car {

    private String model ;
    private String color;
    private int km;
    private int numberOfWheels ;

    public Car(String model, String color, int km, int numberOfWheels, String marka) {
        this.model = model;
        this.color = color;
        this.km = km;
        this.numberOfWheels = numberOfWheels;
        this.marka = marka;
    }

    public Car() { }


    public void infoCar (){
        System.out.println("Arabanin modeli :" + getModel2024() + " " + "Km degeri :" + getKm() ) ;
    }

    public void startCar(){
        System.out.println("car start");
    }


    private String marka;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel2024() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

}
