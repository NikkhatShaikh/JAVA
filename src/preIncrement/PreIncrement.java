package preIncrement;

public class PreIncrement {
    public static void main(String[] args) {

        int a=10;
        ++a;  // 11
        ++a; // 12
        ++a; //13
        System.out.println(a);  // 13
        System.out.println(++a); //14
        System.out.println(a);  // 14

        System.out.println(a++); // 14 = 14+1 = 15
        System.out.println(a);//15

    }
}
