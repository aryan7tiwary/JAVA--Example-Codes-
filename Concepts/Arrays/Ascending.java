// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//      {3, 4, 6, 2} is not sorted in ascending order.


package Concepts.Arrays;
import java.util.*;
public class Ascending 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");    
        int size = in.nextInt();
        int array[] = new int[size];

        System.out.println("Enter elements in array:");
        for(int i=0; i<size; i++)
        {
            array[i] = in.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<size-1; i++)
        {
            if(array[i] > array[i+1])
            {
                isAscending = false;
            }
        }

        if(isAscending)
            System.out.println("Array is in Ascending order.");
        else
            System.out.println("Array is not in Ascending order.");
    }    
}
