public class HW10
{
   public static void main (String [] args)
   {
       //หาค่าสูงสุดใน array
       int num[] = {1,2,3,4,5,6,7,8,9,10};
       int maxIndex = 0;
       for (int i=1; i<num.length; i++) {
        if (num[i] > num[maxIndex]) {
         maxIndex = i;
        }
       }
       //ค่าสูงสุด
       System.out.println("Maximum number is " + num[maxIndex]);
   }
}