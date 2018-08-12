//Program to calculate the Sum of Square of the series

import java.util.Scanner;

public class Series_Square_Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n=sc.nextInt();


        int res=(n*n+1)*(2*n+1)/6;
        System.out.println(res);
    }

}
