package wbl.edu.basic;

import java.util.Map;
import java.util.Scanner;

public class RomanInteger {
    public int romanToInt(String s) {
        Map m1 = new HashMap();
        m1.put("I", "1");
        m1.put("V", "5");
        m1.put("X", "10");
        m1.put("L", "50");
        m1.put("C", "100");
        m1.put("D","500");
        m1.put("M","1000");

        //I can be placed before V (5) and X (10) to make 4 and 9.
        //X can be placed before L (50) and C (100) to make 40 and 90.
        //C can be placed before D (500) and M (1000) to make 400 and 900.

        



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("wneter the Roman Integer");
        System.out.println("Symbol       Value");
        System.out.println("  I             1");
        System.out.println("  V             5");
        System.out.println("  X             10");
        System.out.println("  L             50");
        System.out.println("  C             100");
        System.out.println("  D             500");
        System.out.println("  M             1000");
        String roman=sc.nextLine();
        System.out.println("Integere is " +roman);
        RomanInteger rmn=new RomanInteger();
        int number = rmn.romanToInt(roman);
    }
}
