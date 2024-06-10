
package com.mycompany.emailapp;

import java.util.Arrays;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int defaultPasswordLength=10;
    private String email;
    private String alternateEmail;
    private int mailboxCapacity=500;
    //Constructor to recieve firstname & last name
    public Email(String firstname,String lastname)
    {
        this.firstName=firstname;
        this.lastName=lastname;
       
    //Call a method asking for department - return the department
        this.department=setDepartment();
   
    //Call a method that return a random password
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your Password is :" +this.password);
    //Combine elements to generate Email
      email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+"company.com";
       
    }
    
    //Ask for department
    
    private String setDepartment(){
        System.out.print("New Worker: "+ firstName + "\nDEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code");
        Scanner in =new Scanner(System.in);
        int depChoice=in.nextInt();
        if(depChoice==1){ return "Sales"; }
        else if(depChoice==2){ return "dev"; }
        else if(depChoice==3){ return "Acct"; }
        else {return "";}
    }
    //Generate a random password
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        //return new String(password);
        //the new keyword is necessary for direct object creation and constructor invocation,
        
        
        return  String.valueOf(password);
                   
      //while methods like String.valueOf provide convenient, null-safe ways to achieve
      //similar results without explicit object creation syntax.
      
      
      //  //return  Arrays.toString(password); ..........This method has isssues......will put , and []

    
      
    }
            
    //Set a mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }
    //Set the alternative email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }
 
    //Change the password
    public void changePassword(String password){
        this.password=password;
    }
    
    
    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() {return password;}
    
    public String showInfo() {
        return "DISPLAY NAME: "+ firstName+" "+ lastName +"\nCOMPANY EMAIL: " +email+"\nMAILBOX CAPACITY: "+ mailboxCapacity +"mb" ;
    }
    
}
