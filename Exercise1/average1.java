// Enter 3 numbers from the user & make a function to print their average.

package Exercise1;
import java.util.*;
public class average1 
{
    public static void average(double a, double b, double c)
    {
        double avg = (a+b+c)/3;
        System.out.println("Average of three numbers:"+avg);
        return;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        average(a, b, c);
    }    
}
