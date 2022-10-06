package acciojobpracticequestions;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();

        if(a%2!=0&&b%2!=0){
            System.out.println("we are odd");
        }else {
            System.out.println("we are simple");
        }
    }
}
