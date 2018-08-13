package Core_java01;

import java.util.Scanner;

public class Generic_Root
{
    public static void main(String args[])
    {
        int dup,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        while (num>10)
        {
            dup=num;
            sum=0;
            while (dup !=0)
            {
                sum+=(dup%10);
                dup/=10;
            }
            num=sum;
        }
        System.out.println("The Generic Root is : "+num);
    }
}
