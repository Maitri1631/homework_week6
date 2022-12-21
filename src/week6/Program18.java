package week6;

import java.util.Scanner;

//
//Write a Java program to print the sum (addition), multiply, subtract, divide and
//        remainder of two numbers.
public class Program18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1=sc.nextInt();

        System.out.println("Input Second number:");
        int num2=sc.nextInt();

        System.out.println("Addition is:"+num1+ "+" +num2+  "="  +(num1+num2));
        System.out.println("Subtraction is:"+num1+ "-" +num2+ "="  +(num1-num2));
        System.out.println("Multiplication is:"+num1+ "*" +num2+ "="  +(num1*num2));
        System.out.println("Division is:"+num1+ "/" +num2+ "="   +(num1/num2));
        System.out.println("Reminder is:"+num1+ "mod" +num2+ "="   +(num1%num2));

    }

}
