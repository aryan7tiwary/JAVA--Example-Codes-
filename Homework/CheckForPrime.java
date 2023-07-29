// Print if a number is prime or not (Input n from the user). 

package Homework;
import java.util.*;
public class CheckForPrime 
{
    public static void main(String[] args) 
    {
        int a, c = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check for prime: ");
        a = in.nextInt();
        for(int i = 2; i<a; i++)
        {
            if(a % i == 0)
            {
                c++;
            }
        }
        if(c == 0)
        {
            System.out.println(a+" is a prime number.");
        }
        else
        {
            System.out.println(a+" is not a prime number.");
        }
    }    
}
