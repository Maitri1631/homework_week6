package week6;


//Write a Java programme using the following steps.
//        1.1 Declare two instance variables.
//        1.2 Declare one instance method.
//        1.3 Call both instance variables into the instance method inside the print
//        statement. 1.4 Declare the Main method.
//        1.5 Call the above instance method into the Main method and Run the programme.
public class Program1 {

    int a=20; //instance variable
    int b=25; //instance variable

    public void test(){   //instance method
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Program1 p= new Program1();

        p.test(); // instance method access through object
    }
}
