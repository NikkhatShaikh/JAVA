package conditions;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int button;
        char choice;
        do {
            System.out.println("Enter Your Choice..");
            button=sc.nextInt();
            if(button==1){
                System.out.println(" Hello ..");
            }else if(button==2){
                System.out.println(" Namaste..");
            }else {
                System.out.println("Bonjore..");
            }

            System.out.println(" Do you Want To Continue..");
            choice=sc.next().charAt(0);
        }while (choice=='Y'||choice=='y');
    }
}
