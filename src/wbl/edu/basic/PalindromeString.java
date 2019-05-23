package wbl.edu.basic;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the word");
        String word = sc.nextLine();
        String[] str=word.split("");
        String rev="";
        for (String m:str) {
            rev=m+rev;
        }
        //System.out.println("--"+rev+"--"+word);
        if(word.equals(rev)){System.out.println("Palindrome");}
        else{System.out.println("Not Palindrome");};

    }
}
