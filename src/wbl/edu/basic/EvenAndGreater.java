package wbl.edu.basic;

import java.util.Random;
import java.util.Scanner;

public class EvenAndGreater {
public static void main(String[] args) {
    Random rand=new Random();
    int interger=rand.nextInt(100);
    Scanner number=new Scanner(System.in);
    System.out.println("Here the system will generate number which is between 1-100 ");
    System.out.println("We will pick x");
    System.out.println("program checks if the number generated is");
    System.out.println("->even and greater than x");
    System.out.println("->odd and less than x");
    System.out.println("Enter the value of x(1-100)");
    int x=number.nextInt();
    System.out.println("The number generated is :" +interger);
    if(interger%2==0){
        System.out.println("The number generated is even number");
        if(interger>x)
        {
            System.out.println("Number  is greater than x");
        }
    }else{
        System.out.println("The number generated is odd number");
        if(interger>x)
        {
            System.out.println("Number  is greater than x :" +interger+">"+x);
        }
    }



    }
}
