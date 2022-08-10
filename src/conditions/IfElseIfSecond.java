package conditions;

import java.util.Scanner;

public class IfElseIfSecond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch;
        int a,b;

        do{
            System.out.println(" Enter Your First Number");
            a=sc.nextInt();
            System.out.println("Enter your Second Number");
            b=sc.nextInt();

            if(a==b){
                System.out.println("a is "+a +" and b is "+ b+" both are Equal..");
            }else if (a>b){
                System.out.println(a+" is greater");
            }else {
                System.out.println(b+" is greater");
            }
            System.out.println("Do You Want To Continue...(Y/N)");
            ch=sc.next().charAt(0);

        }while (ch=='Y'||ch=='y');
        if (ch=='n'||ch=='N'){
            System.out.println(" Thank You..!!");
        }
    }
}
