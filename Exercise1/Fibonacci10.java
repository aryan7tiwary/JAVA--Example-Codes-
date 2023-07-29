// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 

package Exercise1;
import java.util.*;
public class Fibonacci10 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = in.nextInt();
        int n1=0, n2=1, n3;
        System.out.print(n1+" "+n2); // printing 0 and 1
        for(int i=2; i<n; i++)
        {
            n3 = n1+n2;
            System.out.print(" "+n3+" ");
            n1 = n2;
            n2 = n3;
        }    
    }    
}
