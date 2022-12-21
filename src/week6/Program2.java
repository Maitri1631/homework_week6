package week6;


//Write a Java programme using the following steps.
//        2.1 Declare two static variables
//        2.2 Declare one static method
//        2.3 Call both static variables into the static method inside the print
//        statement. 2.4 Declare the Main method.
//        2.5 Call the static method into the Main method and Run the programme.
public class Program2 {
    static String name="maitri"; //static variables
    static int x=30; //static variables

    public static void test2(){ //static method

        System.out.println(name);
        System.out.println(x);

    }

    public static void main(String[] args) {
        test2(); //static variables access direct
    }

}
