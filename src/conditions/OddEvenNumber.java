package conditions;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter The Number To Check Even odd Number ..");
            int x= sc.nextInt();


            // Note % = given reminder= baki ex = 2/2 = 0 3/2= 1 here reminder is 1
            if(x%2==0){
                System.out.println(x+" is even Number..");
            }else {
                System.out.println(x+" is odd Number");
            }
            System.out.println(" Do You want To Continue...(y/n)");
            choice=sc.next().charAt(0);
        }while (choice=='Y'||choice=='y');
    }
}
