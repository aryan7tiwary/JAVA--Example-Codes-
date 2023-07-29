// Take an array as input from the user. Search for a given number x and print the 
// index at which it occurs.

package Concepts.Arrays;
import java.util.*;
public class linearSearch 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = in.nextInt();

        System.out.print("Enter value to search: ");
        int search = in.nextInt();

        int array[] = new int[size];
        System.out.println("Enter "+size+" elements:");
        
        for(int i=0; i<size; i++)
        {
            array[i] = in.nextInt();
        }
        
        for(int i=0; i<size; i++)
        {
            if(search == array[i])
            {
                System.out.println(search+" is on index "+i);
            }
        }
    }   
}
