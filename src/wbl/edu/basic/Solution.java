import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        int y=x;
        System.out.println(y);
        int mod=0,rev=0,i=2;
        while(y!=0){
            mod=y%10;
            rev=rev*10+mod;
            y=y/10;
        }
        return  rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter Integer: ");
        int integer=sc.nextInt();
        Solution rint=new Solution();
        int rev=rint.reverse(integer);
        System.out.println("Reverse is : " +rev);

    }
}