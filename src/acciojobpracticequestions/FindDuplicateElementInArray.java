package acciojobpracticequestions;

import java.util.Scanner;

public class FindDuplicateElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Number ");
        int  num=scanner.nextInt();
        int count =0 ;
        do {
             num = scanner.nextInt();
             count++;
        } while (String.valueOf(count).length()==num) ;


    }
}
