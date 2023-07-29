// 1 1 1 1
//  2 2 2
//   3 3
//    4

package Homework.Pattern;

public class InvertedHalfPyramid 
{
    public static void main(String[] args) 
    {
        int m=4;
        for(int i=1; i<=m; i++)
        {
            // spaces
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }

            //numbers
            for(int j=i; j<=m; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }    
}
