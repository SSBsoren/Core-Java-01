//Program to calculate a Reverse of Number using recursion
package Core_java01;

import java.util.Scanner;

public class Reverse_Recursion
{
    static int rev;
    static int reverse(int a)
    {
        if (a==0)
            return 0;
        else
        {
            rev=(rev*10)+(a%10);
            reverse(a/10);
        }
        return rev;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,r;
        System.out.print("Enter a Number : ");
        num=sc.nextInt();
        r=reverse(num);
        System.out.println("Reverse is : "+r);
    }
}
