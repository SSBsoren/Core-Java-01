//Program to calculate the Sum of the series .
//1+2+3+4+5+6+--------+n
import java.util.Scanner;

public class Series_Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter a range : ");
        int n=sc.nextInt();
        int res=(n*(n+1))/2;
        System.out.println(res);
    }
}
