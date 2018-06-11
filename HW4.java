import java.util.Scanner;
public class HW4
{
    //ใส่จำนวนชั้นของ *************
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input row you want..");
        int number =sc.nextInt();
        for (int i = 1; i<=number ; i++)
        {
           System.out.println("*************");
        }
    }
}

