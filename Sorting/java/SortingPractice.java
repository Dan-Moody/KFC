package Sorting.java;

public class SortingPractice {
    /** Sorting algorithms **/

    // Insertion sort.

    public static void insertionSort(int[] array) {
        if ( array == null || array.length == 0 || array.length == 1 ) {
            return;
        }
        for ( int i = 1; i < array.length; i++ ) {
            int j = i;
            while ( j > 0 && array[j] < array[j - 1] ) {
                swap(array, j, j-1);
                j--;
            }
        }
    }

    // Quicksort.
    // With pivot as first element
    public static void quickSort(int[] array) {
        // Make sure array isn't null or empty
        if ( array == null || array.length == 0 ) {
            return;
        }

        // Sort the array from start to end.
        quickSort(array, 0, array.length - 1);
    }

    // Quicksort part of an array
    private static void quickSort(int[] array, int begin, int end) {
        if ( begin < end ) {

            // Split the array using the partition function
            int pivot = partition( array, begin, end );

            // Sort the part of the array from the first element to right before the pivot
            quickSort( array, begin, pivot-1 );
            // Sort the part of the array including pivot to end of array
            quickSort( array, pivot + 1, end );
        }
    }

    // Partition part of an array, and return the index where the pivot
    // ended up.
    private static int partition(int[] array, int begin, int end) {
        // Pick the first element as the pivot
        int pivot = array[begin];

        // Start the sort at index + 1 and the end of array section
        int i = begin + 1;
        int j = end;

        // Move and and j closer to each other until one is found out of place or they collide
        while ( i <= j ) {
            while ( i <= j && array[i] <= pivot ) {
                i++;
            }
            while ( i <= j && array[j] > pivot ) {
                j--;
            }

            // Swap if one is out of place
            if ( i < j ) {
                swap(array, i, j);
                i++;
                j--;
            }
        }

        swap ( array, begin, i - 1 );
        return i - 1;
    }

    // Swap two elements in an array
    private static void swap(int[] array, int i, int j) {
        int x = array[i];
        array[i] = array[j];
        array[j] = x;
    }

    // Mergesort.

    public static int[] mergeSort(int[] array) {
        // Make sure array isn't null or empty
        if ( array == null || array.length == 0 ) {
            return array;
        }
        
        return mergeSort( array, 0, array.length - 1 );
    }

    // Mergesort part of an array
    private static int[] mergeSort(int[] array, int begin, int end) {
        if ( begin < end ) {
            int mid = (end + begin) / 2;

            // Create left and right temp arrays
            int[] left = new int[ mid - begin + 1 ];
            int[] right = new int[ end - mid ];

            // Fill left array
            for ( int i = begin, j = 0; i <= mid; i++, j++ ) {
                left[j] = array[i];
            }

            // Fill right array
            for ( int i = mid + 1, j = 0; i <= end; i++, j++ ) {
                right[j] = array[i];
            }

            // Split left again if its more than 1 element
            if ( left.length > 1 ) {
                left = mergeSort( left, 0, left.length - 1 );
            }
            if ( right.length > 1 ) {
                right = mergeSort( right, 0, right.length - 1 );
            }
            return merge(left, right);
        }
        return array;
    }

    // Merge two sorted arrays into one
    private static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0;

        int[] temp = new int[left.length + right.length];

        int k = 0;
        while ( i < left.length && j < right.length ) {
            if ( left[i] <= right[j] ) {
                temp[k] = left[i];
                i++;
            } else if ( left[i] > right[j] ) {
                temp[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length ) {
            temp[k] = left[i];
            k++;
            i++;
        }
        while ( j < right.length ) {
            temp[k] = right[j];
            k++;
            j++;
        }
        return temp;
    }
}