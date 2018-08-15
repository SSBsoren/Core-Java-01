//program to print the
/*
        *
       ***
      *****
     *******
    *********
   ***********
  *************
 ***************
 */
package Core_java01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle
{
    public static void main(String args[])throws IOException
    {
        System.out.print("Enter the rows of the Series :");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        int row=Integer.parseInt(br.readLine());
        int star=1;
        for (int i=1;i<row;i++)
        {
           for (int j=i;j<row;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=star;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            star=star+2;
        }
    }
}
