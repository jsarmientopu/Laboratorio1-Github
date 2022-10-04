package com.mycompany.holamundo;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FistDays {
	
    public static void main(String[] args) {
        
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);



         
        /* Declare second integer, double, and String variables. */
        int Numerito;
        double Numeros; 
        String Holiwis;
        /* Read and save an integer, double, and String to your variables.*/

        Numerito = scan.nextInt();
         Numeros = scan.nextDouble(); scan.nextLine();  /************ME****** If we dont include scan.nextLine(); WE DONT READ THE NEXT LINE THUS WE DONT SCAN HOLIWIS  WE NEED TO INCLUDE THE NEXTLINE BECAUSE NEXTDOUBLE DOES NOT PASS THE LINE TO READ**/ 
  
        Holiwis = scan.nextLine();
       
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
 System.out.println(Numerito+i);
        /* Print the sum of the double variables on a new line. */
		 System.out.println(Numeros+d);
        /* Concatenate and print the String variables on a new line; 

        	the 's' variable above should be printed first. */
 System.out.println(Holiwis+s);
 
      
        scan.close();
    }
}
    
            
           




