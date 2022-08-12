package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int number=1;
        while (number<=10){
            System.out.println(number*2);
            number++;
        }
    }
}

