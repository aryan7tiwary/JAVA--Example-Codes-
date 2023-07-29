// Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”

package Homework;
import java.util.*;
public class DoWhile1 
{
    public static void main(String[] args) 
    {
        int n =1;
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.print("Now enter the Marks: ");
            int m = in.nextInt();
            if(m >= 90)
            {
                System.out.println("This is Good");
            }
            else if(m >=60)
            {
                System.out.println("This is also Good");
            }
            else
            {
                System.out.println("This is Good as well");
            }

            System.out.print("Input 1 to continue and 0 to stop the loop: ");
            n = in.nextInt();
        }
        while(n!=0);
        System.out.println("The program has ended.");
    }
}