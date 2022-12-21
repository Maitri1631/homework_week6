package week6;

import java.util.Scanner;

// Write a java program to convert a decimal number to binary number
public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number ::");
        int decimal = sc.nextInt();

        String result = Integer.toBinaryString(decimal);
        System.out.println("Convert Binary value into decimal number is ::"+result);
    }
}
