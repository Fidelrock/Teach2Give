/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teach2GiveAssignments;

/**
 *
 * @author DELL
 */

/*
Write a program that takes an integer as input and returns true if the input is a power of two.
Examples: 
8=> returns true
6=> returns false
*/
import java.util.Scanner;

public class PowerTest {
    public static void main(String[]args){
    int randomInput;
    int power = 0;
    int tempAnswer = 0;
    boolean truthValue = false;
    
    System.out.println("Enter an integer number: ");
    Scanner input = new Scanner(System.in);
     randomInput = input.nextInt();
     
     while(tempAnswer < randomInput){
     tempAnswer = (int)(Math.pow(2, power));
     power++;
     if(tempAnswer==randomInput){
     
         truthValue = true;
     }
     }
     
     if(truthValue == true){
     System.out.println("true");
     }
     else{
       System.out.println("false");
     }
    }
    
}
