import java.util.Scanner;
public class HW7

{
    public static void main (String[]args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Input row of Pyramid you want...");
         int row = sc.nextInt();
         int i,j,k=2*row-2;
         for(i=0; i<row;i++)
         {
             for(j=0;j<k;j++)
             {
             System.out.print("-");
            }
            k = k-1;
            for(j=0;j<=i;j++)
            {
             System.out.print("* ");    
            }
            System.out.println();
         }
       }
   }
