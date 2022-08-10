package conditions;

import java.util.Scanner;

public class IfElseAdult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter Your Age..");
            int age = sc.nextInt();

            if (age > 18) {
                System.out.println("Adult");
            } else {
                System.out.println(" not adult");
            }
            System.out.println(" Do You Want to Continue .. (Y/N)");
            choice=sc.next().charAt(0);
        } while (choice=='Y'||choice=='y');
    }
}
