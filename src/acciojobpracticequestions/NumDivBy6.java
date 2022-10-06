package acciojobpracticequestions;

import java.util.Scanner;

public class NumDivBy6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number%6==0){
            System.out.println("Divisible");
        }else {
            System.out.println("Not divisible.");
        }
    }
}
