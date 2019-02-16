import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class QuickSort {
   static int ARRAY_SIZE = Integer.parseInt(System.getProperty("length"));
   final static Integer EMPTY = -1;

   public static void main(String[] args) {
      QuickSort qs = new QuickSort();
      Integer[] array = new Integer[ARRAY_SIZE];
      qs.initArray(array);
      qs.printArray(array);
      array = qs.quickSort(array);
      qs.printArray(array);
   }

   private Integer[] quickSort(Integer[] array) {
      //System.out.println("method quickSort");
      showArray(array);
      List<Integer> lessThanPivot = new ArrayList<>();
      List<Integer> greaterThanPivot = new ArrayList<>();
      List<Integer> equalToPivot = new ArrayList<>();

      if (isArrayLengthOneOrZero(array)) return array;
      else {
         Integer pivot = bepaalPivot(array);
         verdeelArray(pivot, array, lessThanPivot, equalToPivot, greaterThanPivot);
         //System.out.print("lessThanPivot: ");
         showList(lessThanPivot);
         //System.out.print("equalToPivot: ");
         showList(equalToPivot);
         //System.out.print("greaterThanPivot: ");
         showList(greaterThanPivot);
      }
      Integer[] sortedLeft = new Integer[lessThanPivot.size()];
      sortedLeft = quickSort(lessThanPivot.toArray(sortedLeft));
      Integer[] sortedRight = new Integer[greaterThanPivot.size()];
      sortedRight = quickSort(greaterThanPivot.toArray(sortedRight));

      //System.out.print("sortedLeft: ");
      showArray(sortedLeft);
      //System.out.print("sortedRight: ");
      showArray(sortedRight);

      putTogetherSortedArrays(array,sortedLeft,equalToPivot,sortedRight);
      return array;
  }

   private void initArray(Integer[] array) {
      for(Integer i=0;i<array.length;i++) {
         array[i] = (new Random()).nextInt(QuickSort.ARRAY_SIZE);
      }
   }

   private void printArray(Integer[] array) {
      for (Integer i: array) System.out.print(i +  " ");
      System.out.println();
   }

   private void showArray(Integer[] array) {
      //for (Integer i: array) //System.out.print(i +  " ");
      //System.out.println();
   }

   private void showList(List<Integer> array) {
      //for (Integer i: array) //System.out.print(i +  " ");
      //System.out.println();
   }


   public static Integer[] newArray() {
      Integer[] array = new Integer[ARRAY_SIZE];
      for(Integer i=0;i<array.length;i++) {
         array[i] = EMPTY;
      }
      return array;
   }

   public Integer[] concatArrays(Integer[] lessThanPivot, Integer[] greaterThanPivot) {
      int newLength = lessThanPivot.length + greaterThanPivot.length;
      Integer[] newArray = new Integer[newLength];
      int nli = 0;
      for (int i=0;i<lessThanPivot.length;i++) {
         nli = i;
         newArray[nli] = lessThanPivot[i];
      }
      for (int i=0;i<greaterThanPivot.length;i++) {
         newArray[++nli] = greaterThanPivot[i];
      }
      return newArray;
   }

   private boolean isArrayLengthOneOrZero(Integer[] array) {
      boolean isArrayLengthOneOrZero = (array.length < 2);
      //System.out.println("isArrayLengthOneOrZero: " + isArrayLengthOneOrZero);
      return isArrayLengthOneOrZero;
   }
   private Integer bepaalPivot(Integer[] array) {
      Integer pivot = array[0];
      //System.out.println("bepaalPivot: " + pivot);
      return pivot;
   }

   private void verdeelArray(Integer pivot
                           , Integer[] array
                           , List<Integer> lessThanPivot
                           , List<Integer> equalToPivot
                           , List<Integer> greaterThanPivot) {
         for(Integer i=0;i<array.length;i++) {
            if (array[i] < pivot) lessThanPivot.add(array[i]);
            else if (array[i] == pivot) equalToPivot.add(array[i]);
            else greaterThanPivot.add(array[i]);
         }
   }

   private void putTogetherSortedArrays(Integer[] array
                                      , Integer[] left
                                      , List<Integer> middle
                                      , Integer[] right) { 
       //System.out.println("putTogetherSortedArrays: ");                               
       //System.out.println("array.length : " + array.length);                               
       int ai=0;
       for(int i=0;i<left.length;i++){
          array[ai++]=left[i];
       }
       for(Integer i:middle){
          array[ai++]=i;
       }
       for(int i=0;i<right.length;i++){
          array[ai++]=right[i];
       }
   }

}
