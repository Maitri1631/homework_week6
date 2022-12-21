package week6;

//Write a Java program to add two binary numbers.
//        Input Data:
//        Input first binary number: 10
//        Input second binary number: 11
//        Expected Output:
//        Sum of two binary numbers: 101
public class Program16 {

    public static void main(String[] args) {
        // two binary numbers in string format
        String binaryNumber1 = "10", binaryNumber2 = "11";

        // converting strings into binary format numbers
        Integer integer1 = Integer.parseInt(binaryNumber1, 2);
        Integer integer2 = Integer.parseInt(binaryNumber2, 2);

        // adding two integers
        Integer output = integer1 + integer2;

        // converting final output back to Binary Integer
        System.out.println(Integer.toBinaryString(output));
    }
}
