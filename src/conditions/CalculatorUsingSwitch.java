package conditions;

import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        char choice;
        int a,b;
        int opration;
        do {
            System.out.println("Enter First Number");
            a=sc.nextInt();

            System.out.println("Enter Second Number");
            b=sc.nextInt();

            System.out.println(" Enter Your Choice..");
            opration =sc.nextInt();
            switch (opration){
                case 1 :
                    System.out.println("Sum of two number is = "+(a+b));
                    break;
                case 2:
                    System.out.println("subtraction of two number is ="+(a-b));
                    break;
                case 3:
                    System.out.println("multiplication is = "+(a*b));
                    break;
                case 4:
                    System.out.println(" Division = "+(a/b));
                    break;
                case 5:
                    System.out.println(" modulus is ="+(a%b));
                    break;
                default:
                    System.out.println(" Invalid choice");

            }

            System.out.println(" Do You Want To Continue...(Y/N)");
            choice=sc.next().charAt(0);
        }while (choice=='Y'||choice=='y');

    }
}
