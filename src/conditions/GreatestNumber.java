package conditions;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a,b,c;
        char choice;

        do {
            System.out.println("Enter first Number a= ");
            a= scanner.nextInt();
            System.out.println("Enter Second Number b=");
            b= scanner.nextInt();
            System.out.println("Enter Third Number c= ");
            c= scanner.nextInt();

            if(a>b && a>c){
                System.out.println(" a is  greater number ");
            }else if(b>c && b>a){
                System.out.println(" b is greater number");
            }else {
                System.out.println(" c is greater number");
            }
            System.out.println(" Do You Want to continue..(Y/N)");
            choice=scanner.next().charAt(0);
        }while (choice=='y'||choice=='Y');
    }
}
