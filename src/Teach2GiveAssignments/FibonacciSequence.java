/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teach2GiveAssignments;

/**
 *
 * @author DELL
 */
//Write a program to generate the Fibonacci sequence up to 100.

import java.math.BigInteger;

public class FibonacciSequence {
    public static void main(String[] args) {

        BigInteger num1 = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ONE;
        BigInteger sum;

        System.out.println("Fibonacci Series");

        for (int i = 1; i <= 100; i++) {
            System.out.print(num1 + " ");
            sum = num1.add(num2);
            num1 = num2;
            num2 = sum;
        }
    }
}


