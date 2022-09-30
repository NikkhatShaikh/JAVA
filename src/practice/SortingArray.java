package practice;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int arr1 [] = {5,7,2,9,90,1,20,3};

        System.out.println(" Before Sorting arrays ..");
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        System.out.println("After Sorting arrays ..");

        Arrays.sort(arr1);
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

    }
}
