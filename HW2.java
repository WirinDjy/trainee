import java.util.Scanner;
public class HW2
{
    //*-*-*-*-*-
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number pattern you want..");
        int number =sc.nextInt();
        for (int i = 1; i<=number ; i++)
        {
           System.out.print("*-");
        }
    }
}