package acciojobpracticequestions;

import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){

            case 1 :
                System.out.println("you entered less");
                break;
            default:
                System.out.println("you entered more");
        }

    }
}
