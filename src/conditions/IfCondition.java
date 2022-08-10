package conditions;

import java.util.Scanner;

public class IfCondition {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        char choice;

        do {
            System.out.println(" Enter Your Age ..");
            int age= sc.nextInt();
            if (age >= 18) {
                System.out.println(" you Can Vote ...");
              } else {
                System.out.println(" sorry .... You Cant not Vote");
             }
            System.out.println(" Do You want to continue.. type (y/n)");
            choice=sc.next().charAt(0);
        }
        while (choice=='Y'||choice=='y');
    }
}
