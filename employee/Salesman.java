//Project 1
//File name: Salesman.java
//Author: Andora Zuniga 
//August 30, 2019 
//Purpose: contains the salesman class
package employee;
import Employee;
//start of salesman class
public class Salesman extends Employee{
    //decare variables
    final int MONTHS = 12;
    final double PERCENT = .02; 
    final int LIMIT = 20000;
    private String name;
    private int monthlySalary;
    private int sales;
     //**************************methods*******************************
   //constructor
   public Salesman(String n, int salary, int s){
       super(n, salary);
       sales = s;
   }//end of constructor

   //annual salary method
   public int annualSalary(){
       int commission = (int)Math.round(sales * PERCENT);
       if(commission >= LIMIT){
           commission = LIMIT;
       }
       return (super.annualSalary() + comission);
   }//end of annualSalary

   //toString method
   public String toString(){
       return super.toString() + " Annual Sales: " + sales;
   }//end of toString
} //end of salesman class
