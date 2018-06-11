public class HW11
{
    public static void main (String[] args)
    {
        //หาค่าเฉลี่ย avg ใน array
        int[]list ={1,2,3,4,5,6,7,8,9,10};
        int i,sum,avg;
        sum=0;
        for (i=0;i<list.length;i++)
        {
            sum += list[i];
        }
        avg = sum/list.length; //
        System.out.println("The average of number is = "+avg);
    }
}
