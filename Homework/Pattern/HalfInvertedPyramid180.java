//     *
//    ** 
//   ***
//  ****

package Homework.Pattern;
public class HalfInvertedPyramid180 
{
    public static void main(String[] args) 
    { 
        int m=4;
        for(int i=1; i<=m; i++)
        {
            // To print spaces
            for(int j=1; j<=m-i; j++)   // spaces are printed (n-i) times.
            {
                System.out.print(" ");   
            }

            // To print star
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }    
}
