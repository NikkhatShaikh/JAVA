import java.util.Scanner;

public class TableOfNumberUserInput {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        char choice;
        System.out.println("Table Of Given Number is as follows ");

        do {
            System.out.println("Enter Your Number");
            int num= sc.nextInt();

            for (int i = 1; i < 11; i++) {
//            int table =i*num ;
                System.out.println(i * num);
            }
            System.out.println(" Do You Want To continue (Y/N)");
            choice=sc.next().charAt(0);
        }while(choice=='Y'||choice=='y');

    }
}
