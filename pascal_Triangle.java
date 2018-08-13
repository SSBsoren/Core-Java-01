//program to calculate the pascal's triangle
//Pascal’s triangle is a triangular array of the binomial coefficients.
// Write a function that takes an integer value n as input and prints first n lines of the Pascal’s triangle.
package Core_java01;

import java.util.Scanner;

public class pascal_Triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of pascal's Triagle :");
        int len=sc.nextInt();

        for (int i =1; i<=len;i++)
        {
            int ctrl=0;
            for (int space=1;space<=len-i+1; space++)
            {
                System.out.print(" ");
            }
            int k=i;
            for(int j=1;j>=1;j++)
            {
                System.out.print(j+" ");
                if (j==k)
                {
                    j--;
                    k=j;
                    ctrl=1;
                }
                if (ctrl==0)
                    j++;
            }
            System.out.print("\n");
        }

    }
}