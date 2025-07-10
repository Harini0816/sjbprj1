package sjb.TimeComplexity;


public class BinarySearch {

 
 public int search(int[] arr, int key) {
     int low = 0;
     int high = arr.length - 1;

     while (low <= high) {
         int mid = (low + high) / 2;

         if (arr[mid] == key) {
             return mid;  
         } else if (arr[mid] < key) {
             low = mid + 1; 
         } else {
             high = mid - 1;
         }
     }

     return -1; 
 }
}
