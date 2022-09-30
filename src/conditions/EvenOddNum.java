package conditions;

import java.util.Scanner;

public class EvenOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter Your Number...");
            int x= sc.nextInt();
            if(x%2==0){
                System.out.println(" Even Number");
            }else {
                System.out.println("odd Number");
            }
            System.out.println("do You want To continue...type(Y/N)");
            choice=sc.next().charAt(0);

        }while (choice=='y'||choice=='Y');

    }
}
