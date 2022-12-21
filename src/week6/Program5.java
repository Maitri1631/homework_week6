package week6;
//
//Write a program for a calculator with addition, subtraction, multiplication
//        and division methods all with parameters and use string concatenation
//        methods.(Note: Two static and Two instance methods.)
public class Program5 {

    public static void addition(int a, int b) {    //static method

        System.out.println("Addition of " + a + " + " + b +  " = " + (a + b)); //Print statement with concatenation
    }


    public static void subtraction(int a, int b) {  //static method

        System.out.println("Subtraction of " + a+ " - "+ b + " = " + (a - b)); //Print statement with concatenation
    }

    public void multiplication(){  //instance method
        int a = 10;
        int b = 5;
        int c = a*b;
        System.out.println("Multiplication of " + a + " * "+ b + " = " + c); //Print statement with concatenation


    }

    public void division (double a, double b){  //instance method
        // Multiplication math to call answer c
        double c = a/b;
        System.out.println("Division of " + a + " / "+ b + " = " + c); //Print statement with concatenation
    }


    public static void main(String[] args) {
        Program5 p= new Program5();//object
        p.addition(10,20);

        subtraction(10,20);
        p.multiplication();
        p.division(10,20);
    }
}
