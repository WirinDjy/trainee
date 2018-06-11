public class HW9
{
   public static void main (String [] args)
   {
       //หาค่าต่ำสุดใน array
       int num[] = {1,2,3,4,5,6,7,8,9,10};
       int minIndex = 0;
       for (int i=1; i<num.length; i++) {
        if (num[i] < num[minIndex]) {
         minIndex = i;
        }
       }
       //ค่าต่ำสุด
       System.out.println("Minimum number is " + num[minIndex]);
    }
}
