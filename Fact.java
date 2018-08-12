import java.util.Scanner;

public class Fact
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Nunber :");
        int num=sc.nextInt();

        int f=1;
        while (num>0)
        {
            f=f*num--;

        }
        System.out.println("Factorial is "+f);
    }
}
