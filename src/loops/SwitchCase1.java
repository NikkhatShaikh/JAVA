package loops;

import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter Your Character Only In Capital Letters");
            char cases = scanner.next().charAt(0);

            switch (cases) {
                case 'A':
                    System.out.println(" I am The First Letter");
                    break;
                case 'B':
                    System.out.println(" I am the second letter ");
                    break;
                case 'C':
                    System.out.println(" I am the Third letter ");
                    break;
                case 'D':
                    System.out.println("  I am the fourth letter ");
                    break;
                case 'E':
                    System.out.println(" I am the fifth letter");
                    break;
                default:
                    System.out.println(" I don't belong here");
                    break;
            }
            System.out.println(" Do You want To continue.. (Y/N)");
            choice=scanner.next().charAt(0);
        }while (choice=='Y'||choice=='y');
    }
}
