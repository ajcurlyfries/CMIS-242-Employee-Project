//Project 1
//File name: Employee.java
//Author: Andora Zuniga 
//August 30, 2019 
//Purpose: contains the employee class and two subclasses- salesman and executive
 package employee;
//start of employee class- the SUPER CLASS
public class Employee {
    //decare variables
    final int MONTHS = 12;
    private String name;
    private int monthlySalary;
    //**************************methods*******************************
    //constructor
    public Employee(String n, int salary){
        name = n;
        monthlySalary = salary;
    }//end of constructor

    //default constructor
    public Employee(){
    }//end of default constructor

    //annual salary method
    public int annualSalary(){
        int aSalary = monthlySalary * MONTHS;
        return aSalary;
    }//end of annualSalary

    //toString method
    public String toString(){
        String details = "Name: " + name + " Monthly Salary: " + monthlySalary;
        return details; 
    }//end of tostring 
}//end of employee class 