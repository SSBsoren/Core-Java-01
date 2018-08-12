//Program to calculate the Power of Number

import java.util.Scanner;

public class Power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();

        System.out.print("Enter the Power : ");
        int power=sc.nextInt();

        float res=1.0f;
        if (power>0)

            for (int i=1;i<=power;i++)
                res*=num;

        else
            for (int i=1;i<=(-power);i++);
            res/=(float)num;
            System.out.println(res);

    }
}
