package wbl.edu.basic;

import java.util.Scanner;

public class firstEven {
    public static void main(String[] args) {
        int[] array={3,5,2,4,9};
        int even=0;
        for (int i=0;i<array.length;i++){
            int j=0;
            if(array[i]%2==0){
                even=array[i];
                break;
            }
        }
        System.out.println("First even number is: " + even);
    }
}
