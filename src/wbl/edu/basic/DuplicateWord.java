package wbl.edu.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DuplicateWord {
    public static void main(String[] args) {
        Scanner string=new Scanner(System.in);
        System.out.println("Enter the string");
        String  str=string.nextLine();
        String[] strArray=str.split(" ");
        //ArrayList<String> arr=new ArrayList<String>();

        String[] newarray;
        for(int i=0;i<strArray.length;i++){
            //System.out.println(strArray[i]);
            for(int j=i+1;j<strArray.length ;j++){
                //System.out.println(strArray[i]+"--->"+strArray[j]);
                int count=0;
                if(strArray[i].equals(strArray[j])){
                    System.out.println("Duplicate word is :"+ strArray[i] );
                    break;
                }

            }
        }
       }
}
