import java.util.Scanner;
import java.lang.Math; 
public class HW6
{
    //ใชั้นของ *******สลับ-------
     public static void main (String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Input row you want..");
         int number =sc.nextInt();
         int i,j,k;
           for( i = 0 ; i<number ; i++ )
           {  
            for( j = 0 ; j<number ; j++ )
            {  
             System.out.println("**********");
            break;
             }  
            System.out.println("----------");
             } 
    }
}




