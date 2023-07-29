package Concepts.Functions;
import java.util.*;
public class AddTwoNumbers 
{
    public static int addTwoNumbers(int a, int b)
    {
        int sum = a+b;     
        return sum;     // return a+b;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(addTwoNumbers(a, b));
    }    
}
