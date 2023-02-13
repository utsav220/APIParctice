package SwapNumber;

public class SwapNumUsingThirdVar {
//Swap two number using 3 var
    public static void main(String[] args) {
          int a =10;
          int b=20;
        System.out.println("Before swap num " + a +" "+b);
        int c=a+b;  //30
         a=c-a; //30-10=20
        b=c-a;   //30-20=10
        System.out.println("After swap num " + a +" "+b);


    }
}
