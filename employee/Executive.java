//Project 1
//File name: Executive.java
//Author: Andora Zuniga 
//August 30, 2019 
//Purpose: contains the executive class
package employee;
import Employee;
//start of executive class
public class Executive extends Employee{
    //decare variables
    final int MONTHS = 12;
    final int STOCKP = 50;
    final int BONUS = 30000;
    private String name;
    private int monthlySalary;
    private int stock;
    //**************************methods*******************************
    //constructor
    public Executive(String n, int salary, int s){
        super(n, salary);
        stock = s;
    }//end of constructor

    //annual salary method
    public int annualSalary(){
        int bonus = 0;
        if(stock > STOCKP){
            bonus = BONUS;
        }//end if
        return (super.annualSalary() + bonus);
    }//end of annualSalary

    //toString method
    public String toString(){
        return super.toString() + " Stock Price:" + stock; 
    }
}//end of executive class