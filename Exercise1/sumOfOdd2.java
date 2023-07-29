// Write a function to print the sum of all odd numbers from 1 to n.

package Exercise1;
import java.util.*;
public class sumOfOdd2 
{
    public static void sumOfOdd(int n)
    {
        int sum=0;
        for(int i=1; i<=n; i++)
        {
            if(i%2!=0)
            {
                sum = sum+i;
            }
        }
        System.out.println("Sum of odd numbers: "+sum);
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter a number:");
        int n = in.nextInt();
        sumOfOdd(n);
    }    
}
