//    *
//   *** 
//  *****
// *******
// *******
//  *****
//   ***
//    *
package Homework.Pattern;

public class Diamond 
{
    public static void main(String[] args) 
    {
        int m=4;
        for(int i=1; i<=4; i++)
        {
            // spaces
            for(int j=1; j<=m-i; j++)
            {
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=m; i>=1; i--)
        {
            // spaces
            for(int j=1; j<=m-i; j++)
            {
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}