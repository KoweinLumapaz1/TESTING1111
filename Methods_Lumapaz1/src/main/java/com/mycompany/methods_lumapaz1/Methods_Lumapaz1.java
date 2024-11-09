/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methods_lumapaz1;
import java.util.Scanner;

public class Methods_Lumapaz1 {

    
    public static void myMethod(String fname, String lname, String course, int age ){
        System.out.println( "\nHello " + fname + " " + lname + " - " + age + " from " + course);    
         
    }
    
    public static void main(String[] args) {
      
        Scanner input = new Scanner ( System.in);
        String respo;
        
        do{
        System.out.println("\nEnter first name: ");
        String fname = input.nextLine();
        
       
        System.out.println("Enter last name: ");
        String lname = input.nextLine();
        
        System.out.println("Enter age: ");
        int age = input.nextInt();
        input.nextLine();
        
        System.out.println("Enter course: ");
        String course = input.nextLine();
        
        myMethod(fname, lname, course, age );
        
        System.out.println( "\nTry again? Type 'quit' to Exit.");  
        respo = input.nextLine();
        }
        while(!respo.equals("quit"));
        }
  
       }

 //System.exit(status:0); - force exit
