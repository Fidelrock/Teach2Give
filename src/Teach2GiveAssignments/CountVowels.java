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
Write a program that counts the number of vowels in a sentence.
*/

import java.util.Scanner;
public class CountVowels {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string of choice: ");
    String input = scanner.nextLine().toLowerCase();
 
    int vowelCount = 0;
    for(int i= 0;i<input.length();i++){
        char ch = input.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        
        System.out.print(ch+" ");
    vowelCount++;
    }
    }
     System.out.println();
    System.out.println("Available vowels are: "+vowelCount);
   
    
    }
}
