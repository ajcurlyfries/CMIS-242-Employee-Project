//Project 1
//File name: TestEmployee.java
//Author: Andora Zuniga 
//August 30, 2019 
//Purpose:  contains the main method. It should read in employee information from a text file and display a report
package employee;
//import statements
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import Employee;
import Salesman;
import Executive;
//start of class
public class TestEmployee{
    //start of main 
    public static void main(String[] args) {
        //declare variables
        String fileName = null;
        int count14 = 0;
        int count15 = 0;    
        int year, mSal, extra;
        String type, name;    
        //Scanner for user input
        Scanner responseScanner = null;
        Scanner in = null;
        
        //**************scanner instances***************
        try{
            //Scanner for user input
            responseScanner = new Scanner(System.in);
            //ask user for filename
            System.out.print("Please enter the file name (include .txt): ");
            fileName = responseScanner.nextLine();
        } catch(Exception io){
            System.out.println("File name error: " + io.getMessage() );
            System.exit(0);
        }
        //*************Processing the file***************
        // declare year arrays
        Employee[] year2014 = new Employee[10];
        Employee[] year2015 = new Employee[10];
        //create scanner for file
        try{
            //read file
            in = new Scanner (new BufferedReader(new FileReader(fileName)));
            //use \n as delimiter
            in.useDelimiter("\n");
        }//end of try 
        //catch block
        catch (IOException io ) {
            System.out.println("The file could not be opened: " + io.getMessage() );
            System.exit(0);
         } // end catch

        //start of try block    
        try {
            //While loop to sort through data line by line, put data into variables and create objects
            while (in.hasNext()) {
             //  in.useDelimeter(" ");
               //sort through line 
                year = Integer.parseInt(in.next());
                type = in.next();
                name = in.next();
                mSal = Integer.parseInt(in.next());
                if (in.hasNext()){
                    extra = Integer.parseInt(in.next());
                } else {                
                     extra = 0;
                }//end else

                //**************create object*****************
                //put into 2014 array
                if (year == 2014){
                    //sort by type
                    if (type == "Employee"){
                        year2014[count14] = new Employee(name, mSal);
                    }//end Employee if
                    if (type == "Salesman"){
                        year2014[count14] = new Salesman(name, mSal, extra);
                    }//end salesman if
                    if (type == "Executive"){
                        year2014[count14] = new Executive(name, mSal, extra);
                    }//end executive if
                    //up counter
                    count14++;
                }//end if for year check

                //put into 2015 array
                if (year == 2015){
                    //sort by type
                    if (type == "Employee"){
                        year2015[count15] = new Employee(name, mSal);
                    }//end Employee if
                    if (type == "Salesman"){
                        year2015[count15] = new Salesman(name, mSal, extra);
                    }//end salesman if
                    if (type == "Executive"){
                        year2015[count15] = new Executive(name, mSal, extra);
                    }//end executive if
                    //up counter
                    count15++;
                }//end if for year check

            }//end while
        } // end try block
        
                //stop at end of file
                finally {
                    if (in != null) {
                        in.close();
                    }
                } // end finally

        //**********************Report****************************
        System.out.println("\n***************Employee Report***************");
        //2014 Report
        System.out.println("\n2014:");
        for(int i=0; i<=count14; i++){
            System.out.println(year2014[i].toString() + " Annual Salary: " + year2014[i].annualSalary());
        }//end of for loop

        //2015 Report
        System.out.println("\n2015:");
        for(int i=0; i<=count15; i++){
            System.out.println(year2015[i].toString() + " Annual Salary: " + year2015[i].annualSalary());
        }//end of for loop


    }//end of main
}//end of class
