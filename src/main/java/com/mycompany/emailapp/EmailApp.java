
package com.mycompany.emailapp;


public class EmailApp {

    public static void main(String[] args) {
      Email em1=new Email("Vishal","Batra");
        System.out.println(em1.showInfo());
      
     em1.setAlternateEmail("visbt1970@gmail.com");
       System.out.println(em1.getAlternateEmail());
//        
        
//      em1.changePassword(password);
//      em1.setAlternateEmail(altEmail);
//      em1.setMailboxCapacity(0);
        
// System.out.println("Hello World!");
    }
}
