// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

package Homework.Pattern;

public class Butterfly
{
    public static void main(String[] args) 
    {
        int m=5;

        // upper part
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");

            }
            
            // spaces
            int space = 2*(m-i);
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part
        for(int i=m; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");

            }
            
            // spaces
            int space = 2*(m-i);
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
