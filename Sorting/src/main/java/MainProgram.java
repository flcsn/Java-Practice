import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        sort(array);
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[indexOfSmallest] > array[i]) {
                indexOfSmallest = i;
            }
        }
        
        return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallest = startIndex;
        
        for (int i = startIndex; i < array.length; i++) {
            if (array[indexOfSmallest] > array[i]) {
                indexOfSmallest = i;
            }
        }
        
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;        
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexOfSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallest);
            System.out.println(Arrays.toString(array));
        }
    }

}
