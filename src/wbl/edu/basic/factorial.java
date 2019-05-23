package wbl.edu.basic;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENeter the number for which factorial haas to found");
        int fact=sc.nextInt();
        int tot=1;
        for(int i=1;i<=fact;i++){
            tot=i*tot;
        }
        System.out.println(tot);
    }
}
