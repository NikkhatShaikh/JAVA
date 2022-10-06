package acciojobpracticequestions;

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number =scanner.nextInt();

        if(number<30){
            System.out.println("less important");
        }else {
            System.out.println("more important");
        }
    }
}
