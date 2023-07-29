// *****
// *   *
// *   *
// *****

// For tracking boundary in pattern/matrix: i=1 or j=1 or i=n or j=m (n and m are rows and columns)

package Homework.Pattern;
public class HollowRectangle 
{
    public static void main(String[] args) 
    {
        int n=4;
        int m=5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1;j<=m; j++)
            {
                if(i==1 || j==1 || i==n || j==m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
}
