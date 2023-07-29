//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1

package Homework.Pattern;

public class PascalTriangle
{
    public static void main(String[] args) 
    {
        int m=5;

        // Method One:

        // for(int i=0; i<m; i++)
        // {
        //     // spaces
        //     for(int j=1; j<=m-i; j++)
        //     {
        //         System.out.print(" ");
        //     }

        //     // numbers
        //     int num=1;
        //     for(int j=0; j<=i; j++)
        //     {
        //         System.out.print(num+ " ");
        //         num = num*(i-j)/(j+1);
        //     }
        //     System.out.println();
        // }
        



// Method Two:
        PascalTriangle obj = new PascalTriangle(); 
        for(int i=0; i<=m; i++)
        {
            for(int j=0; j<m-i; j++)    //spaces
            {
                System.out.print(" ");
            }
            
            for(int j=0; j<=i; j++)     //numbers
            {
                System.out.print(obj.coeff(i,j)+ " ");
            }
            System.out.println();
        }
        
    }

    int coeff(int n, int r) // function to calculate binomial coefficient
    {
        int c = fact(n)/(fact(r) * fact(n-r));
        return c;
    }
    int fact(int n) // function to calculate factorial
    {
        int f=1;
        for(int i=1; i<=n; i++)
        {
            f=f*i;
        }
        return f;
    } 
}