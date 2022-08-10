package conditions;

import java.util.Scanner;

public class IfElseIfLadder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char choice;
        int first;
        int second;

        do {
            System.out.println(" Enter Your First Number..");
            first=sc.nextInt();
            System.out.println("Enter Your Second Number..");
            second=sc.nextInt();


            if(first==second){
                System.out.println(first+"and"+second+"is equal numbers");
            }
            else{
                if(first>second){
                    System.out.println(first+"is greater");
                }else {
                    System.out.println(second+"is Greater");
                }
            }

            System.out.println("Do You Want To Continue..(Y/N)");
            choice=sc.next().charAt(0);
        }while(choice=='Y'||choice=='y');
    }
}
