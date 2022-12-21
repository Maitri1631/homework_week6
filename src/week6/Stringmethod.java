package week6;

public class Stringmethod {

    public static void main(String[] args) {
        String name= "Maitri ";
        String lname="PATEL";

        System.out.println(name.length());
        System.out.println(name.charAt(5));
        System.out.println(name.concat(lname));
        System.out.println(name.contains("tri"));
        System.out.println(name.startsWith("mai"));
        System.out.println(name.endsWith("ri"));
        System.out.println(name.equals(lname));
        System.out.println(name.indexOf(0));
        System.out.println(name.isEmpty());
        System.out.println(name.replace('m','a'));
        System.out.println(name.substring(2));
        System.out.println(name.toCharArray());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());

    }
}
