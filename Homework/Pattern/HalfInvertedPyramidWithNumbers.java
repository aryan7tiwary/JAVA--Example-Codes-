// 12345
// 1234
// 123
// 12
// 1

package Homework.Pattern;
public class HalfInvertedPyramidWithNumbers 
{
    public static void main(String[] args) 
    {
        int m=5;
        for(int i=m; i>=m; i--)
        {
            for(int j=1; j>=m; j++)
            {
                System.out.print(j);
            }
            System.out.println();
            m--;
        }    
    }    
}
