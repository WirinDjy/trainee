import java.util.Scanner;
import java.lang.Math; 
 public class HW6_2
 {
      //ใชั้นของ *******สลับ-------
      public static void main (String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Input row you want..");
         int number =sc.nextInt();
         int i,j,k;
         //ลูปสร้างชั้นที่ต้องการ
           for( i = 0 ; i<number ; i++ )
           {  
            // ถ้าบรรทัดเป็นจำนวนคี่ พิมพ์ *
            if(i%2==0)  {
             System.out.println("**********");             
             }  
             // ถ้าบรรทัดเป็นจำนวนคู่พิมพ์ -
            if(i%2==1)  {
             System.out.println("----------");
             }  
        }
     }
 }




