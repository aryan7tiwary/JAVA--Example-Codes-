// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

package Exercise1;
import java.util.*;
public class Vote5 
{
    public static boolean votingEligibility(int age)
    {
        if(age > 18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = in.nextInt();
        if(votingEligibility(age))
        {
            System.out.println("You can vote!");
        }
        else
        {
            System.out.println("You cannot vote!");
        }
    }
}
