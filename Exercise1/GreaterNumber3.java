// Write a function which takes in 2 numbers and returns the greater of those two.

package Exercise1;
import java.util.*;
public class GreaterNumber3 
{
    public static void greater(int a, int b)
    {
        if(a>b)
        {
            System.out.println(a+" is greater than "+b);
        }
        else if(b>a)
        {
            System.out.println(b+" is greater than "+a);
        }
        else
        {
            System.out.println(a+" is equal to "+b);
        }
        return;
    }
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        greater(a, b);
    }    
}
