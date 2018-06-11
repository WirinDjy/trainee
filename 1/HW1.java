import java.util.Scanner;
public class HW1
{
    //ใส่ค่า จำนวน* เรียงตามแนวนอน
   public static void main (String [] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input number you want");
       int number = sc.nextInt();
       for (int i=1;i<=number;i++)
        {
         System.out.print("*");  
        }
    }
}
