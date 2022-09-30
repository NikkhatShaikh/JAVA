package practice;

import java.util.Scanner;
import java.util.SortedMap;

public class JavaInputs {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter Integer Number ");
        int a= sc.nextInt();   // take integer i/p

        System.out.println("Enter String value ..");
        String name = sc.next();   // take single word


        System.out.println("Enter float number");
        float num1=sc.nextFloat();       //  take floating value

        System.out.println("Enter collections of words .. sentences ..");
        String str = sc.nextLine();  // take multiple words

        // print all inputs

        System.out.println(" first Integer Value is "+a);
        System.out.println(" first string value is "+name);
        System.out.println("collections of words is "+str);
        System.out.println(" floating number "+num1);





    }
}
