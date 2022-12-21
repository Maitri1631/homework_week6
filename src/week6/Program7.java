package week6;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("input a degree in faherwnheit:");
        double fahrenheit= sc.nextDouble();

        double celsious= ((5*(fahrenheit-32.0))/9.0);
        System.out.println(fahrenheit +  "degree fahrenhiet is qual to  "+celsious+ "in celious");
    }

}
