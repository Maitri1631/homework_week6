package week6;


//Write a Java programme using the following steps.
//        3.1 Declare one instance and one static variable.
//        3.2 Declare one instance method.
//        3.3 Declare one static method.
//        3.4 Call both instance and static variables i
//        nto both instance and static methods inside the print statement.
//        3.5 Declare the Main method.
//        3.6 Call both instance and static methods into the Main method and run the programme.
public class Program3 {


    int q=28; //instance variable
    static  String enmae="karan"; //static variable

    public void demo(){ //instance method
        System.out.println(q);
        System.out.println(enmae);
    }

    public static void demo2(){ //static method
        Program3 p1 =new Program3();
        System.out.println(p1.q);
        System.out.println(enmae);

    }

    public static void main(String[] args) {

        Program3 p3 =new Program3();
        p3.demo(); // instance method access object through
        demo2(); // static method call direct
    }
}
