package Core_java01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Series
{
    public static void main(String args[])throws IOException
    {
        System.out.print("Enter the limit of the Series :");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        int lim=Integer.parseInt(br.readLine());
        for (int i=1;i<=lim;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
