package com.merveturk.oop.polymorphism;

public abstract class Doctor {

    private int tckn ;
    private String name ;
    private int totalWorkingYears;
    private final int CONSTANT = 500;

    abstract  void  sleep();

    public void workStyle(){
        System.out.print("Normal working");
    }

    public int calculateDoctorSalary(){
        return totalWorkingYears * CONSTANT ;
    }



    public int getTckn() {
        return tckn;
    }

    public void setTckn(int tckn) {
        this.tckn = tckn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalWorkingYears() {
        return totalWorkingYears;
    }

    public void setTotalWorkingYears(int totalWorkingYears) {
        this.totalWorkingYears = totalWorkingYears;
    }

    public int getCONSTANT() {
        return CONSTANT;
    }
}
