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
  Write a program that prints the numbers from 1 to 100. For multiples of 3, print "Fizz"; for 
multiples of 5, print "Buzz"; and for numbers that are multiples of both 3 and 5, print 
"FizzBuzz".
 */

 public class FizzBuzz{

    public static void main (String[]args){

        for(int i = 1;i<=100;i++){

            if(i%3==0){
                
                if(i % 5==0){
                System.out.println(i+ " :FizzBuzz");
                }
                else{
                System.out.println(i + " : FIZZ");
                }
            }
            else if(i % 5== 0){
                if(i % 3==0){
                System.out.println(i+ " :FizzBuzz");
                }
                else{
                    System.out.println(i + ": BUZZ");
                }
            }
            
            else{
                System.out.println(i);
            }
            }
            }
        }
