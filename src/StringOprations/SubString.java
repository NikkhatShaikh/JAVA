package StringOprations;

import java.util.Arrays;

public class SubString {

    public static void main(String args[])
{

    String text= new String("Hello, My name is Sachin");

    /* Splits the sentence by the delimeter passed as an argument */

    String[] strAr = text.split(",");

    System.out.println(Arrays.toString(strAr));

////    String[] strAr = {"Ani", "Sam", "Joe"};
//    for (int i=0;i<strAr.length;i++){
//        System.out.println(strAr[i]);
//    }

    int count = 0 ;
    for (String str :strAr){
//        System.out.println(str);

        if (count==0){
            String s1 = str;
            System.out.println(s1);
            System.out.println("first Loop");
        }else if(count==1){
            String s2 = str;
            System.out.println(s2);
            System.out.println("second Loop");
        }else {
            System.out.println(" ended ");
        }

        count ++;

    }



}



}