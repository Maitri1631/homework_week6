package week6;

//Write a Java programme using the following steps.
//        4.1 Declare two instance and two static variables.
//        4.2 Declare one instance method.
//        4.3 Declare one static method.
//        4.4 Call all four instance and static variables into both instance and static methods inside the
//        print statement.
//        4.5 Declare the Main method.
//        4.6 Call both instance and static methods into the Main method and run the programme.
public class Program4 {

    int x=10;
    int y=20;

    static String fname="maitri";
    static String lname="patel";

    public void q1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(fname);
        System.out.println(lname);
    }

    public  static void q2(){

        Program4 p4 =new Program4();
        System.out.println(p4.x);
        System.out.println(p4.y);
        System.out.println(fname);
        System.out.println(lname);
    }

    public static void main(String[] args) {
        Program4 p=new Program4();
        p.q1();
        q2();
    }

}
