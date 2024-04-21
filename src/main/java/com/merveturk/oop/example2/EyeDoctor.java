package com.merveturk.oop.example2;

public class EyeDoctor extends Doctor{

    public String info ( String info){
       return info;
    }
    @Override
    public int calculateDoctorSalary(){
       int salary= super.calculateDoctorSalary();
        return (salary*30)/ 100;
    }
    public int xx(){
        return calculateDoctorSalary();
    }
    public int yy(){
        return super.calculateDoctorSalary();
    }
    public void  sleep(){
        System.out.print("Eye doctor sleeping");
    };


}
