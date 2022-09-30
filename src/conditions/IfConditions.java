package conditions;

import java.util.Scanner;

public class IfConditions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age ..");
        int age = sc.nextInt();
        if(age>18){
            System.out.println(" You are Adult \n You can Vote ..");
        }
    }
}
