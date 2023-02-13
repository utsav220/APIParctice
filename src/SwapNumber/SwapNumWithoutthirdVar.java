package SwapNumber;

public class SwapNumWithoutthirdVar {
    public static void main(String[] args) {

        int a =10;
        int b=20;
        System.out.println("Before swap num " + a +" "+b);
        a=a+b; //30
        b=a-b; //30-20
        a=a-b;
        System.out.println("After swap num " + a +" "+b);
    }
}
