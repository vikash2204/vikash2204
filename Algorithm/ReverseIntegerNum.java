package Algorithms;

public class ReverseIntegerNum {
    public static void main(String[] Args) {
        int x = -531;
        boolean negative = false;
        if(x < 0){
            x *= -1;
            negative = true;
        }
        long reversed = 0;

        while(x > 0){
            reversed =  (reversed *10)+ (x % 10);
            x /= 10;
        }

        if (reversed > Integer.MAX_VALUE){
            System.out.println("Not a valid number");
        }
        reversed = negative ? (int)(-1 * reversed) : (int)(reversed);
        System.out.println("Reversed number is : "+ reversed);

    }
}
