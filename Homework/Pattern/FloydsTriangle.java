// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

package Homework.Pattern;
public class FloydsTriangle
{
    public static void main(String[] args) 
    {
        int m=5;
        int c=1;
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }    
    }
}