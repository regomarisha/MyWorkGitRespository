package wbl.edu.basic;

import java.util.Scanner;

public class WordCOunt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("There enetred string is ");
        System.out.println(str);
        String[] strarray=str.split(" ");
        System.out.println("word count : " +strarray.length);
    }
}
