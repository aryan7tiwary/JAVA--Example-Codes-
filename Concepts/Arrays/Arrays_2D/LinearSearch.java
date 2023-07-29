// Searching for an element x in a matrix.

package Concepts.Arrays.Arrays_2D;
import java.util.*;
public class LinearSearch 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Row and Column of Array: ");
        int row = in.nextInt();
        int col = in.nextInt();
        int array[][] = new int[row][col];
        
        System.out.println("Enter elements in the Array:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                array[i][j] = in.nextInt();
            }
        }

        System.out.print("Enter number to search: ");
        int search = in.nextInt();

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(array[i][j] == search)
                {
                    System.out.println(search+" is at location " +i+ ", "+j);
                }
            }
        }
    }
}
