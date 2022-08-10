package conditions;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char choice;
        int number;
        do {
            System.out.println("Enter Number");

            number=sc.nextInt();

            if(number>0){
                System.out.println(" Positive Number");
            }else {
                System.out.println("Negative Number");
            }
            System.out.println(" Do You Want To Continue..(Y/N)");
            choice=sc.next().charAt(0);
        }while (choice=='y'||choice=='Y');
    }
}
