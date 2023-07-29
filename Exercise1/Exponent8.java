// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn

package Exercise1;
import java.util.*;
public class Exponent8 
{
    public static void calcExponent(int x, int n)
    {
        double expo = Math.pow(x, n);
        System.out.println("Output: "+expo);
        return;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number and it's power:");
        int x = in.nextInt();
        int n = in.nextInt();
        calcExponent(x, n);
    }    
}