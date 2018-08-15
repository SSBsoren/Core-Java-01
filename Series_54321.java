//program to ptint
   /*   987654321
        98765432
        9876543
        987654
        98765
        9876
        987
        98
        9 */
package Core_java01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Series_54321
{
    public static void main(String args[])throws IOException
    {
        System.out.print("Enter the limit of the Series :");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        int lim=Integer.parseInt(br.readLine());
         for (int j=1;j<=lim;j++)
        {
            for(int i=lim;i>=j;i--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
