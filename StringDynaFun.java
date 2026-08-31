import java.util.*;
class StringDynaFun
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String s = sc.nextLine();
        System.out.println("THE STRING IS: " + s);
        System.out.println("THE LENGTH OF STRING IS " + s.length());
        System.out.println("THE CHARACTER AT 6TH POSITION IS " +s.charAt(6));
        System.out.println("SUBSTRING FROM 0 TO 7 IS " +s.substring(0,7));
        System.out.println( "UPPER CASE OF STRING IS "+s.toUpperCase());
        System.out.println("LOWER CASE OF STRING IS " +s.toLowerCase());
        System.out.println("STRING CONTAINS JAVA " +s.contains("Java"));
        System.out.println("STRING STARTS WITH HELLO " +s.startsWith("Hello"));
        System.out.println("STRING ENDS WITH JAVA " +s.endsWith("Java"));
        System.out.println("INDEX OF J IN STRING IS " +s.indexOf("J"));
    }
}           
