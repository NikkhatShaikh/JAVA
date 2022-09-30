package conditions;

import java.util.Scanner;

public class IfElseLadder1 {
    public static void main(String[] args) {

        {
            Scanner scanner = new Scanner(System.in);
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
            }
        }
        }



