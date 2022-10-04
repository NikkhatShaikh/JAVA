package acciojobpracticequestions;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        // area = pi*r*r

        Scanner sc = new Scanner(System.in);
        int r =sc.nextInt();

        float pi = 3.14f;
        float area= pi*(r*r);

        // perimeter of circle = 2*pi*r;

        float perimeter = 2*pi*r;
        System.out.println(area);
        System.out.println(perimeter);
    }
}
