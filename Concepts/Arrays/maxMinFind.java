// Find the maximum & minimum number in an array of integers. 

package Concepts.Arrays;
import java.util.*;
public class maxMinFind 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();
        int array[] = new int[size];

        System.out.println("Input values in array:");
        for(int i=0; i<size; i++)
        {
            array[i] = in.nextInt();
        }

        // min
        int min = array[0];
        for(int i=0; i<size; i++)
        {
            if(array[i]<min)
            {
                min = array[i];
            }
        }
        System.out.println("Min: "+min);

        // max
        int max = array[0];
        for(int i=0; i<size; i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
        }
        System.out.println("Max: "+max);
    }
}
