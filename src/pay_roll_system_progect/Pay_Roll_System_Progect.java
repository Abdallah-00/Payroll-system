/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package pay_roll_system_progect;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author HP ZBOOK Alaa_Ahmed 
 */
public class Pay_Roll_System_Progect {
    
    
    /**
     * @param args the command line arguments
     */
    
    
     public static void main(String[] args) {
        
      //the registered username and password on the system
      String password_admain="12345";
      String username_admain="admin";
      Scanner sc = new Scanner(System.in);
      
      //definning an array list for the engineer and the trainee
      ArrayList<Engineer> engineers = new ArrayList<> ();      
      ArrayList<Trainee> trainees = new ArrayList<> (); 
      
      int exit=0;
     
      //Log in form
      System.out.println("If You Are An Admin Please Log in ");
      System.out.println("Enter your Username : ");
      String username=sc.next();
      System.out.println("Enter your password : ");
      String password=sc.next();
      System.out.println("-----------------------------------------------------------------------        ");
      
      //check the data login
     while((!(username_admain).equals(username))||(!password.equals(password_admain) )){
      System.out.println("Wrong name or Password, Please log in again");
      System.out.println("Enter your username : ");
      username=sc.next();
      System.out.println("Enter your password : ");
      password=sc.next();
     }
    
     //adding initial data of the team in the system
      engineers.add(new Engineer(0,"Alaa",20,2,8));
      engineers.add(new Engineer(1,"Abdallah",19,3,2));
      engineers.add(new Engineer(2,"Karim Ali",19,3,7));
      trainees.add(new Trainee("Ain Shams",3,2019,0,"Yousry",19));
      trainees.add(new Trainee("Ain Shams",2.9,2019,1,"Karim Fathy",19));
    
    
     while(!"e".equals(exit)){
      
      int inpu;
      
      //Options List for the Admin to can modify the data in the system
      System.out.println("Choose what do you want to do : ");
      System.out.println(" 1 - press(1) If You Want to Add An New Engineer.  ");
      System.out.println(" 2 - press(2) If You Want to Delete An Engineer .  ");
      System.out.println(" 3 - press(3) If You Want to Update or Edit An Engineer .  ");
      System.out.println(" 4 - press(4) If You Want to Show all Registered Engineers  .  "); 
      System.out.println(" 5 - press(5) If You Want to Add An Trainee.  ");
      System.out.println(" 6 - press(6) If You Want to Delete An Trainee .  ");
      System.out.println(" 7 - press(7) If You Want to Update or Edit An Trainee .  ");
      System.out.println(" 8 - press(8) If You Want to Show all Registered Trainees .  "); 
      System.out.print("Your input : ");    inpu=sc.nextInt();
      System.out.println("-----------------------------------------------------------------------        ");
      
      
      //first option to add an new engineer 
      if (inpu==1)
      {
      int id,age,grade,workinghours = 0;String name;
      System.out.println("Enter the Engineer Id :");
      id=sc.nextInt();
      System.out.println("Enter the Engineer Name :");
      name=sc.next();
      System.out.println("Enter the Engineer Age :");
      age=sc.nextInt();
      
      //options to choose the grade of the engineer 
      System.out.println(" 1 - press (1)If The Grade of the Engineer is Manager");
      System.out.println(" 2 - press (2)If The Grade of the Engineer is Team leader");
      System.out.println(" 3 - press (3)If The Grade of the Engineer is Team member");
      System.out.println("Enter the Engineer Grade :");
      grade=sc.nextInt();
      
      //check if the input of the grade is valid or not
      if(grade==1||grade==2||grade==3){
      System.out.println("Enter the Engineer Working Hours Per Day :");
      workinghours=sc.nextInt();
      
      //BUILT IN ADD METHOD IN ARRAY LIST
      engineers.add(new Engineer(id,name,age,grade,workinghours));
      }
      
      //if the input is invalid the process is repeated
      else 
      {      System.out.println("you enetred invalid Grade  ");
             System.out.println(" 1 - press (1)If The Grade of the Engineer is Manager");
             System.out.println(" 2 - press (2)If The Grade of the Engineer is Team leader");
             System.out.println(" 3 - press (3)If The Grade of the Engineer is Team member");
             System.out.println(" please enter a valid grade");
             grade=sc.nextInt();
             if(grade==1||grade==2||grade==3){
                 
             //BUILT IN ADD METHOD IN ARRAY LIST
             engineers.add(new Engineer(id,name,age,grade,workinghours));}
      }
             System.out.println("The Engineer Is Added");
             System.out.println("-----------------------------------------------------------------------        ");
      }
      
      
      //second option to delete an engineer 
      else if (inpu==2)
      {
      int index;
      //check if the system has registered engineers or not
      if(engineers.isEmpty()) {System.out.println("The System Has No Registered Engineer");}
         
      else 
      {    System.out.println("Enter the Engineer Number That You Want To Delete :");
           index=sc.nextInt();
      //Exception handles :if the admin entered an index not in the array list or system has not registered an engineer at this index
            try 
            {
              //the execution code if there is no an exception
                
              //BUILT IN REMOVE METHOD IN ARRAY LIST
              engineers.remove(index-1);
              System.out.println("The Engineer Is Deleted");
              System.out.println("-----------------------------------------------------------------------        ");
             } 
            
            //the execution code if if there is an exception
            catch (IndexOutOfBoundsException e) {System.out.println("Invalid Index");
             }
               
                  
       }
      }
      
      
      
      
      
      
     //third option to update an registered engineer 
      else if (inpu==3)
      {
      int index,id,age,grade,workinghours;String name;
      
      //check if the system has registered engineers or not to update
      if(engineers.isEmpty()) {System.out.println("The system has no registered Engineer in the position you entered");}
      
      else
      {  System.out.println("Enter the Engineer number that you want to update :");
         index=sc.nextInt();
         
       //Exception handles :if the admin entered an index not in the array list or system has not registered an engineer at this index
         try 
         {
         //the execution code if if there is no exception
         if(index<=engineers.size()){
             
         System.out.println("Enter The Engineer Modified Id :");
         id=sc.nextInt();
         System.out.println("Enter The Engineer modified Name :");
         name=sc.next();
         System.out.println("Enter The Engineer Modified Age :");
         age=sc.nextInt();
         System.out.println("Enter The Engineer Modified Grade :");
         grade=sc.nextInt();
         System.out.println("Enter The Engineer Modified Working Hours :");
         workinghours=sc.nextInt();
         
         //BUILT IN SET METHOD IN ARRAY LIST
         engineers.set(index, new Engineer(id,name,age,grade,workinghours));
         System.out.println("The Engineer Is Modified");
         System.out.println("The Data Is Updated ");
         System.out.println("-----------------------------------------------------------------------        ");}
         
         else
         {
         System.out.println("The Index Number Doesn't Exist To Update It");}
         }
         
         //the execution code if if there is an exception
         catch (IndexOutOfBoundsException e) {System.out.println("Invalid Index");    
          }
     }
     }
      
      
      //the fourth option to show all registered engineer
      else if (inpu==4)
      {
          
      //check if the system has registered engineers or not to show all registered engineer
      if(engineers.isEmpty()) {System.out.println("The System Has No Registered Engineer To Show");}
      
      else 
      {   for
                  //METHOD IN ENGINEER CLASS TO SHOW ALL REGISTERED ENGINEERS
                 (int i=0;i<=engineers.size()-1;i++){engineers.get(i).show_All() ;
                 System.out.println("-----------------------------------------------------------------------        ");
      }
      } 
        System.out.println("-----------------------------------------------------------------------        ");
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      //the fifth option to add a trainee
      else if (inpu==5)
      {
      int id,age,gpa,academic_year;String name,university_name;
      System.out.println("Enter The Trainee Id :");
      id=sc.nextInt();
      System.out.println("Enter The Trainee Name :");
      name=sc.next();
      System.out.println("Enter The Trainee Age :");
      age=sc.nextInt();
      System.out.println("Enter The Trainee University Name :");
      university_name=sc.next();
      System.out.println("Enter The Trainee GPA :");
      gpa=sc.nextInt();
      System.out.println("Enter The Trainee Academic year :");
      academic_year=sc.nextInt();
      
      //BUILT IN ADD METHOD IN ARRAY LIST
      trainees.add(new Trainee(university_name,gpa,academic_year,id,name,age));
      System.out.println("The Trainee Is Added ");
      System.out.println("-----------------------------------------------------------------------        ");
      }
      
      
      //SIX OPTION TO DELETE A REGISTERED TRAINEE
      else if (inpu==6)
      {
      int index;
      
      //check if the system has registered trainees or not to delete
      if(trainees.isEmpty()) {System.out.println("The System Has No Registered Trainee");
      }
      else {System.out.println("Enter The Trainee Number That You Want To Delete :");
      index=sc.nextInt();
      
      //Exception handles :if the admin entered an index not in the array list or system has not registered a trainee at this index
      try {
           
            //built in remove method in array list
            trainees.remove(index);
            System.out.println("The Trainee Is Deleted");
            System.out.println("-----------------------------------------------------------------------        ");
          } 
      
      //the execution code if if there is an exception
      catch 
           (IndexOutOfBoundsException e) {System.out.println("Invalid Index");
           }
      
      }
      }
      
      
      //seventh option to update a registered trainee
      else if (inpu==7)
      {
      int index,id,age,gpa,academic_year;String name,university_name;
      
      //check if the system has registered trainees or not to delete
      if(trainees.isEmpty()) {System.out.println("The System Has No Registered Engineer In The Position You Entered");}
      
      else {System.out.println("Enter The Engineer Number That You Want To Update :");
      index=sc.nextInt();
      
      //Exception handles :if the admin entered an index not in the array list or system has not registered a trainee at this index
      try 
      {
      //the execution code if if there is no exception
      if(index<=engineers.size()){
             
      System.out.println("Enter The Trainee Id :");
      id=sc.nextInt();
      System.out.println("Enter The Trainee Name :");
      name=sc.next();
      System.out.println("Enter The Trainee Age :");
      age=sc.nextInt();
      System.out.println("Enter The Trainee University Name :");
      university_name=sc.next();
      System.out.println("Enter The Trainee GPA :");
      gpa=sc.nextInt();
      System.out.println("Enter The Trainee Academic Year :");
      academic_year=sc.nextInt();
      
      //built in set method in array list
      trainees.set(index,new Trainee(university_name,gpa,academic_year,id,name,age));
      System.out.println("The Data Is Modified ");
      System.out.println("-----------------------------------------------------------------------        ");}
      else 
      {System.out.println("The Index Number Doesn't Exist To Update It");}
      } 
      
      //the execution code if if there is an exception
      catch (IndexOutOfBoundsException e) {System.out.println("Invalid Index");
             
      }
      
      
      }}
      
      
      
      //the last option to shoe all trainees
      else if (inpu==8)
      {
          
      //check if the system has registered trainees or not to show
      if(trainees.isEmpty()) {System.out.println("The system has no registered Trainee to print");}
      
      else 
         {
             for
               (int i=0;i<=trainees.size()-1;i++){trainees.get(i).show_All() ;
               System.out.println("-----------------------------------------------------------------------        ");
                                                 }
         }
      }
      
    
      
      
      //options to admin to exit from the program or complete in it
      System.out.println(" 0 - Press (0) If You Want To Exit From The System  ");
      System.out.println(" 1- press (1) To Complete In The System ");
      exit=sc.nextInt();
     }
}
}
