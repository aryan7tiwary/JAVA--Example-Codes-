// For a given matrix of N x M, print its transpose.

package Concepts.Arrays.Arrays_2D;
import java.util.*;
public class Transpose
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter row and column of array: ");
        int row = in.nextInt();
        int col = in.nextInt();
        int array[][] = new int[row][col];
        
        System.out.println("Enter elements in array:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                array[i][j] = in.nextInt();
            }
        }

        // original matrix
        System.out.println("\nORIGINAL MATRIX:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        // transpose
        System.out.println("\nTRANSPOSE");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }
    }
}