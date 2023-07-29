package Concepts.Functions;
import java.util.*;
public class FactorialNumber 
{
    public static void calculateFactorial(int n)    // 
    {
        if(n<0)
        {
            System.out.println("Invalid Input!");
            return;
        }
        int f = 1;
        for(int i=1; i<=n; i++)
        {
            f = f * i;
        }
        System.out.println("Factorial of "+n+" is: "+f);
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = in.nextInt();
        calculateFactorial(n);
    }
}
