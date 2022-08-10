package conditions;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        char choice;
        do {
            System.out.println(" Enter Your choice Button No - ex - 1 , 2 , 3 ");
            int button= sc.nextInt();


            switch (button){
                case 1:
                    System.out.println(" hello");
                    break;
                case 2:
                    System.out.println(" Namaste");
                    break;
                case 3:
                    System.out.println("banjore");
                    break;
                default:
                    System.out.println("Invalid");
            }
            System.out.println(" Do You want To continue..(Y/N)");
            choice=sc.next().charAt(0);

        }while (choice=='y'||choice=='Y');
    }
}
