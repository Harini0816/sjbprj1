package sjb.TimeComplexity;



public class MainSS {
 public static void main(String[] args) {
     int[] data = {29, 10, 14, 37, 13};

     Selectionsort sorter = new Selectionsort(); 
     System.out.println("Original array:");
     sorter.printArray(data);

     sorter.sort(data); 
     System.out.println("Sorted array:");
     sorter.printArray(data);
 }
}

