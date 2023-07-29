// Write a function that takes in the radius as input and returns the circumference of a circle.

package Exercise1;
import java.util.*;
public class Circumference4 
{
    public static void calculateCircumference(double r)
    {
        double circum = 2* 3.14 * r;
        System.out.println("Circumference of Circle: "+circum);
        return;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of a circle:");    
        double r = in.nextDouble();
        calculateCircumference(r);
    }    
}
