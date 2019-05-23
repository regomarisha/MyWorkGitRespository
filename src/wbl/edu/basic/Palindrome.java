package wbl.edu.basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the number");
        int digit = sc.nextInt();
        int num=digit;
        int reverse = 0, mod=0, rem=0;
        while (digit != 0) {
            mod = digit % 10;
            reverse = reverse * 10 + mod;
            digit = digit / 10;
        }

        if(num==reverse) {
            System.out.println("is palidrome");
        }else {
            System.out.println("not palindrome");
        }
    }   }