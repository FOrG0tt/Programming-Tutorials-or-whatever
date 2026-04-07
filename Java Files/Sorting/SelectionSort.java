package Sorting;
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5, 3, 8, 1};
        sortArray(arr);

        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sortArray(int[] arr) { // selection sort
        // save array length (obviously)
        int arrlength = arr.length;
        // starting loop to set the minimum index
        for (int i = 0; i < arrlength - 1; i++) {
            // assume min index is the current pass so start from first
            int minIndex = i;
            // another loop to compare current min index to the rest of the array
            for (int j = i + 1; j < arrlength; j++) {
                // check if min index is greater than the next index
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // store the minimum value into an integer variable
            int minValue = arr[minIndex];
            // swaps the minimum index's value with the current one
            arr[minIndex] = arr[i];
            // and then it swaps the minimum value into the current one.
            arr[i] = minValue;

            // it goes like this:
            // arr = [5, 3, 8, 1] (current pass is index [0] which is 5)
            // it finds the min value which is [3] with the value of 1
            // stores it into minValue (so minValue is now 1)
            // and then we swap the current index (index [0]) into the minimum index (index [3])
            // so now the array is [5, 3, 8, 5]
            // and then we swap the current index's value (which is 5) into the minimum value (which is 1)
            // so now the array is [1, 3, 8, 5]
            // and then it repeats for the rest
        }
    }

}