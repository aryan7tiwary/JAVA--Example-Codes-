//        1
//       212
//      32123
//     4321234
//    543212345

package Homework.Pattern;

public class PalindromicPyramid 
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

            // first half numbers
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }

            // second half numbers
            for(int j=2; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}