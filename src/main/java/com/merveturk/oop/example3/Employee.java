package com.merveturk.oop.example3;

 public abstract class Employee {

     private String tckn;
     private String name;
     private static final int sbt  = 500;
     protected int totalWorkingYear ;

     public void workStyle(){
         System.out.print("Employee have been Starting ");
     }

     public int calculateEmployeeSalary(){
         return totalWorkingYear * sbt;
     }








     public String getTckn() {
         return tckn;
     }

     public void setTckn(String tckn) {
         this.tckn = tckn;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getTotalWorkingYear() {
         return totalWorkingYear;
     }

     public void setTotalWorkingYear(int totalWorkingYear) {
         this.totalWorkingYear = totalWorkingYear;
     }
 }
