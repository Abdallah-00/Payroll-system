/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package name
package pay_roll_system_progect;

/**
 *
 * @author HP ZBOOK
 */
//Inheritance   &&   Encapsulation
public class Engineer extends Employee{

    //Abstraction
    private int Grade;
    private String Position;
    
    //Parameterized constructor with parent constructor(super constructor)
    public Engineer( int id, String name, int age,int Grade,int working_hours) {
        super(id, name, age);
        this.Grade = Grade;
        this.salary=3000;
        this.working_hours=working_hours;
        this.Set_position(Grade,working_hours);
    }
    
    
    //parameterized constructor with one parameter
    public Engineer(int Grade) {
        this.Grade = Grade;
        this.Set_position(Grade,working_hours);
    }

    
    //default constructor
    public Engineer() {}

    
    //parameterized constructor with (id , name , age) parameter
    public Engineer(int id, String name, int age) {
        super(id, name,  age);
    }
    
    
    //method to get the position of the engineer 
    public String Set_position(int g,int work_hour){
    Grade=g;
         if(Grade==1) {
            
                Position="Manager";
                working_hours=work_hour;
                pay_rate_per_hour=30;
                tax_rate=0.15;
                salary=pay_rate_per_hour*working_hours-tax_rate;
                }
                else if(Grade == 2){
                Position="Team Leader";
                working_hours=work_hour;
                pay_rate_per_hour=20;
                tax_rate=0.12;
                salary=pay_rate_per_hour*working_hours-tax_rate;
                }
                else if(Grade==3){
                Position="Team Member";
                working_hours=work_hour;
                pay_rate_per_hour=10;
                tax_rate=0.1;
                salary=pay_rate_per_hour*working_hours-tax_rate;
                }
                
                else {Position="Engineer";working_hours=work_hour;}
               
    
    return  Position;
    } 
    
    
    //getter method
    public String getPosition()
    {
        return Position;
    }

    
    //methid to show all information about the engineer
    public void show_All()
    {
        System.out.println("The Engineer Informations Are :- ");
        System.out.println("The Engineer ID Is = " +id);
        System.out.println("The Engineer Name Is = " +name);
        System.out.println("The Engineer Age Is = " +age);
        System.out.println("The Engineer Grade Is = " +Grade);
        System.out.println("The Engineer Position Is = " +Position);
        System.out.println("The Engineer Working Hours Is =  "+working_hours);
        System.out.println("The Engineer Salary Is = " +salary+" $ "+" Per "+working_hours+" Working Hours "+" Day ");
    }
    
    
    //overriding (Polymorphism)
    
    //overriding method to get salary of the engineer 
    @Override
    public double calculate_salary(int WorkingHours) 
    {
    return salary;
    }
}
