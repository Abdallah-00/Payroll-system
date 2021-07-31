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

//Encapsulation
public abstract class Employee {
    
    //Abstraction 
    protected int id;
    protected String name;
    protected double salary;
    protected int age;
    protected int working_hours;
    protected double pay_rate_per_hour;
    protected double tax_rate;
    protected String position;
    
    
    // paramiterized constructor
    public Employee(int id, String name, int age) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    
    // default constructor
    public Employee(){}
            
    //Setter function
    public void setId(int id)
    {
        this.id = id;
    }
    
    //Setter function
    public void setName(String name)
    {
        this.name = name;
    }
    
    //Setter function
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    //Setter function
    public void setAge(int age) 
    {
        this.age = age;
    }
    
    //Setter function
    public void setPay_rate(double pay_rate_per_hour) 
    {
        this.pay_rate_per_hour = pay_rate_per_hour;
    }
    
    //Setter function
    public void setTax_rate(double tax_rate) 
    {
        this.tax_rate = tax_rate;
    }
    
    //getter function
    public int getId()
    {
        return id;
    }
    
    //getter function
    public String getName()
    {
        return name;
    }
    
    //getter function
    public double getSalary() 
    {
        return salary;
    }
    
    //getter function
    public int getAge() 
    {
        return age;
    }
    
    //getter function
    public double getPay_rate() 
    {
        return pay_rate_per_hour;
    }
    
    //getter function
    public double getTax_rate() 
    {
        return tax_rate;
    }
    
    //calculate salary abstract method with only header 
    public abstract double calculate_salary(int WorkingHours );
    
}
