/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package name
package pay_roll_system_progect;
import java.util.Scanner;
/**
 *
 * @author HP ZBOOK
 */

//Inheritance   &&   Encapsulation
public class Trainee extends Employee{
    
    
    Scanner in=new Scanner(System.in);
    
    //Abstraction
    public String university_name;
    public double GPA;
    public int academic_year;

    
    //Parameterized constructor
    public Trainee(String university_name, double GPA, int academic_year, int id, String name, int age) 
    {
        super(id, name,age);
        this.university_name = university_name;
        this.GPA = GPA;
        this.academic_year = academic_year;
        salary=10;
    }

    
    //Parameterized constructor with( university_name , GPA , academic_year)parameters
    public Trainee(String university_name, double GPA, int academic_year)
    {
        this.university_name = university_name;
        this.GPA = GPA;
        this.academic_year = academic_year;
    }
    
    //default constructor
    public Trainee(){}
    
    //assign value of the salary in salar variable
    double salar=getSalary();
    
    //Setter function
    public void setSalar(double salar)
    {
    
    }
    
    
    //Overriding (Polymorphism)
    @Override
    
    //calculate_salary method to calculate salary by((pay rate per hour * working hours)-tax rate) with fixed pay rate per hour && fixed tax rate for the trainee
    public double calculate_salary(int w) 
    {
      working_hours = w;
      salary=5*working_hours-0.05;
      return salary;
    } 
    
    //method to show all the data of all registered trainees in the system
    public void show_All()
    {
        System.out.println("The Trainee Informations Are :- ");
        System.out.println("The Trainee ID Is = " +id);
        System.out.println("The Trainee Name Is = " +name);
        System.out.println("The Trainee Age Is = " +age);
        System.out.println("The Trainee Salary Is = " +salary+" $ "+" In Day ");
    }

}

