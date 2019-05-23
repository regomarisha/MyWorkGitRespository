package wbl.edu.basic;

import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the word");
        String word=input.nextLine();
        System.out.println("Capitalizing the first letter");
        char w=word.charAt(0);
        char w1=Character.toUpperCase(w);
        System.out.println(word.replace(w,w1));
    }

}
