package acciojobpracticequestions;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int f=scanner.nextInt();

        int T=(f-32)*5/9;
        System.out.println(T);
    }
}
