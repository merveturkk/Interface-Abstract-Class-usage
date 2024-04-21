package com.merveturk.oop.example1;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setColor("red");
        car.setKm(2000);
        car.setMarka("2024");
        car.setNumberOfWheels(4);
        car.setModel("Rcz");

        car.startCar();
        car.infoCar();

        Mercedes mercedes = new Mercedes();
        mercedes.setColor("Black");
        mercedes.setModel("2023");
        mercedes.infoCar();
        mercedes.infoMercedes();

        Volvo volvo = new Volvo();

        volvo.infoCar();
        volvo.setColor("White");
        volvo.setKm(80);
        volvo.infoVolvo();






    }
}