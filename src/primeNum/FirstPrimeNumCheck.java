package primeNum;

import java.util.Scanner;

public class FirstPrimeNumCheck {
    public static void main(String[] args) {
   //int n=5;
        Scanner sc=new Scanner(System.in);
        System.out.println("put the num");
        int num= sc.nextInt();
   for(int i =2;i<num;i++) {
       if(num%2==0) {
           System.out.println("prime num");
       }
       else {
           System.out.println("not prime");
       }
       break;
   }
    }
}
