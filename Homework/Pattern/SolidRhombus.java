//     *****
//    *****
//   *****
//  *****
// *****

package Homework.Pattern;

public class SolidRhombus 
{
    public static void main(String[] args) 
    {
        int m=5;
        
        for(int i=m; i>=1; i--)
        {

            // spaces
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=m; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }    
}
