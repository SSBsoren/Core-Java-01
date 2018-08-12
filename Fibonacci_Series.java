//The Fibonacci series is a series where the next term is the sum of pervious two terms.
// The first two terms of the Fibonacci sequence is 0 followed by 1.
//1 2 3 5 8 13 21 34 55 89 144...............
import java.util.Scanner;

public class Fibonacci_Series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,range;

        System.out.print("Enter the Range : ");
        range=sc.nextInt();
        a=0;
        b=1;
        System.out.println(" "+a+" "+b);
        for (int i=1;i<range;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
