package com.merveturk.oop.example3;

public class CalculateSalaryService {

    public static void main(String[] args) {


        // Polymorphism yapisi
        Employee employee = new Engineer();//engineer gibi davranir.
        employee.setName("Engineer");
        employee.calculateEmployeeSalary();


        Employee employee1 = new Manager();// manager gibi davranir.
        employee.setName("Manager");
        employee.calculateEmployeeSalary();


    }
}
