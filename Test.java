import java.util.stream.IntStream;
import java.lang.Math; 
public class Test {
  public static void main(String[] args) {
   int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   int sum = 0;
   for(int i = 0; i < a.length; i++){
    sum += a[i];
    System.out.println("Sum of array is " + sum);
   }
 }
}