package practice;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int addition=a+b;
        System.out.println("addition  is ="+addition);

        int sub= a-b;
        System.out.println("sub is = "+sub);

        int multiplication = a*b;
        System.out.println("multiplication is = "+multiplication);

        int divide=a/b;
        System.out.println("division is ="+divide);

        int module=a%b;
        System.out.println("modulus is = "+module);
    }
}
