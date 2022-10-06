package acciojobpracticequestions;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int number = scanner.nextInt();
        switch (number){
            case 28:
                System.out.println("i am young");
                break;
            default:
                System.out.println("i am not young");
        }
    }
}
