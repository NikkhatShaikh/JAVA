package variables;

// localVariable -- inside method
// instance variable - inside class and outside method
// static variable -variable - declared with static keyword
public class Variables {

    String name = "shwetaAnjali";  // instance variable
    static  String schoolName="Qspider";

    public static void main(String[] args) {
        Variables obj=new Variables();
        int myAge=26;// local variable

        System.out.println("My Name is .. "+obj.name);
        System.out.println("Age " +myAge);
        System.out.println("SchoolName .. "+ Variables.schoolName);

    }
}
