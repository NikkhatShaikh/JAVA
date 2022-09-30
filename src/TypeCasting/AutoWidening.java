package TypeCasting;

public class AutoWidening {
    public static void main(String[] args) {
        int age = 20;
        double salary=age;  // auto widening - convert small data type into larger automatically .

        System.out.println(" salary is "+salary);
        System.out.println(age);

    }
}
