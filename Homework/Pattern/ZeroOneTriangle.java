// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

package Homework.Pattern;

public class ZeroOneTriangle 
{
   public static void main(String[] args) 
   {
      int m=5;
      for(int i=1; i<=m; i++)
      {
         for(int j=1; j<=i; j++)
         {
            if((i+j)%2==0)   // Notice that 1 is printed when sum of it's i and j (visualized as matrix) is even.
            {
               System.out.print("1 ");
            }
            else
            {
               System.out.print("0 ");
            }
         }
         System.out.println();
      }
   } 
}