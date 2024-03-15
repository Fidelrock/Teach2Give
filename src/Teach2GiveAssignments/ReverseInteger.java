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
Write a program that takes an integer as input and returns an integer with reversed digit 
ordering.
Examples:
For input 500, the program should return 5.
For input -56, the program should return -65.
For input -90, the program should return -9.
For input 91, the program should return 19.
*/
import java.util.Scanner;
public class ReverseInteger {
 public static void main(String []args){
    Scanner scanner = new Scanner(System.in);
    

    System.out.println("Enter any number to get it's reverse: ");
    
        int anyNumber = scanner.nextInt(); 
        
        int reverse = 0;
                boolean isNegative =false;
        
                if(anyNumber <0){
       isNegative = true;
       anyNumber = -anyNumber; //Convert to positive for reversal
        }
        while(anyNumber >0){
reverse = reverse * 10 + anyNumber % 10;
anyNumber = anyNumber /10;
}
     

        if(isNegative){
        reverse = - reverse;
        }
        System.out.println(reverse);
        
        
 }
    
}
