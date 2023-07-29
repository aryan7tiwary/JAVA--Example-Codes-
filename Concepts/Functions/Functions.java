package Concepts.Functions;

import java.util.*;
public class Functions 
{
    public static void printMyName(String name)
    {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = in.nextLine();
        printMyName(name);
    }    
}
