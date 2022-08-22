package practice;

import java.util.Scanner;

public class AddNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = scanner.nextInt();
        System.out.println("Enter Second Number");
        int b= scanner.nextInt();

        int sum = a+b;

        System.out.println("sum of "+a+" and "+b+" is "+sum);

    }
}
