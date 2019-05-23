package wbl.edu.basic;

import java.util.Scanner;

public class Fionacci {
    public static void main(String[] args) {
        System.out.println("enter the nmber till which  fibonacci numbers should be calculated" );
        Scanner sc=new Scanner(System.in);
        int fib=sc.nextInt();
        int num=1;
        int fibo=0;
        int prev=0;
        System.out.println("Fibonacci series till "+fib);
        //System.out.println("0");
        //System.out.println("1");
        for (int i=0;i<fib;i++){
            System.out.println(prev);
            fibo=num+prev;
            prev=num;
            num=fibo;
        }
    }
}
