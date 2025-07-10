package sjb.TimeComplexity;


import java.util.Arrays;

public class MainBS {
 public static void main(String[] args) {
     int[] data = {5, 7, 9, 12, 15, 23}; 
     int key = 23; 
     BinarySearch bs = new BinarySearch(); 
     int result = bs.search(data, key);

     if (result != -1) {
         System.out.println("Element found at index: " + result);
     } else {
         System.out.println("Element not found.");
     }
 }
}
