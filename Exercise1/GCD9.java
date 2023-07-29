// Write a function that calculates the Greatest Common Divisor of 2 numbers.

package Exercise1;
import java.util.*;
public class GCD9 
{
    public static int calcGCD(int a, int b)
    {
        int gcd = 1;
        for(int i=1; i<=a; i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Greatest Common Divisor is: "+calcGCD(a, b));
    }    
}
