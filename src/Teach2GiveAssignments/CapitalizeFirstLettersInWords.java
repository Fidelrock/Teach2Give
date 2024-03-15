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
Write a program that accepts a string as input, capitalizes the first letter of each word in the 
string, and then returns the result string.
Examples: 
"hi"=> returns "Hi"
"i love programming"=> returns "I Love Programming"
*/
import java.util.Scanner;
public class CapitalizeFirstLettersInWords {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String inputString = input.nextLine();

        // Capitalize the first letter of each word in the string
        String capitalizedString = capitalizeWords(inputString);

        // Output the result
        System.out.println("Capitalized string: " + capitalizedString);

        // Close the scanner
        input.close();
    }

    // Method to capitalize the first letter of each word in a string
    public static String capitalizeWords(String inputWord) {
        StringBuilder result = new StringBuilder();

        // Split the string into words using space as the delimiter
        String[] words = inputWord.split("\\s");

        for (String word : words) {
            // Capitalize the first letter of each word and append it to the result
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }

        // Remove the trailing space and return the result
        
        return result.toString().trim();
    }
}