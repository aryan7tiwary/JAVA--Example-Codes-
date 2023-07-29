package Homework;
import java.util.*;
public class CalculatorV1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number:");
        int a = in.nextInt();
        int b = in.nextInt();
        int result = 0;
        
        System.out.println("Enter 1 for + (Addition)\nEnter 2 for - (Subtraction)\nEnter 3 for * (Multiplication)\nEnter 4 for / (Division)\nEnter 5 for % remainder");
        int o = in.nextInt();

        switch(o)
        {
            case 1: result = a+b;
            break;
            case 2: result = a-b;
            break;
            case 3: result = a * b;
            break;
            case 4: 
                if(b == 0)
                {
                    System.out.println("Invalid Input");
                }
                else
                {
                    result = a / b;
                }
            break;
            case 5: 
                if(b == 0)
                {
                    System.out.println("Invalid Input");
                }
                else
                {
                    result = a / b;
                }
            break;
        }
        System.out.println("Result:"+result);
    }
}
