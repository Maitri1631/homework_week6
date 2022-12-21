package week6;

import java.util.Scanner;

//Write a Java program that takes three numbers as input to calculate and
//print the average of the numbers.
public class Program13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Input first number: ");
        n1=sc.nextInt();

        System.out.println("Input Second number: ");
        n2=sc.nextInt();

        System.out.println("Input Three number: ");
        n3=sc.nextInt();

        System.out.println("Average of three numbers is: " + (n1 + n2 + n3) / 3);

    }
}
