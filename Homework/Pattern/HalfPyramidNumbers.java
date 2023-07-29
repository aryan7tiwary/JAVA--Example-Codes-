//     1
//    1 2
//   1 2 3
//  1 2 3 4
// 1 2 3 4 5

package Homework.Pattern;

public class HalfPyramidNumbers
{
    public static void main(String[] args) 
    {
        int m=5;
        for(int i=1; i<=m; i++)
        {
            // spaces
            for(int j=1; j<=(m-i); j++)
            {
                System.out.print(" ");
            }

            // numbers
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }    
}
