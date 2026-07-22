
// Bubble Sort - In bubble sort here we can shift the largest element at the end by comparing the adjacent element.

// import java.util.*;

// public class Sort {
//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
    
//    public static void main(String args[]) {
//     int arr[] = {7,8,3,1,2};
//      // time complexity = 0(n^2)
//     //bubble sort 
//     for(int i=0; i<arr.length-1; i++) { // n-1
//      for(int j=0; j<arr.length-i-1; j++){
//         if(arr[j] >arr[j+1]){
//            //swap
//           int temp = arr[j];
//           arr[j] = arr[j+1];
//           arr[j+1] = temp;
//      }
//     }
// }
//        printArray(arr);
//    }
// }


 // Selection Sort - are those where we can place the smallest element at the start by direct replace with the first element.

import java.util.*;

public class Sort {

    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {7, 8, 3, 1, 2};

        // Selection Sort
        for(int i = 0; i < arr.length - 1; i++) {

            int smallest = i;

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            // Swap after inner loop
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }
}




// Insertion Sort 
// import java.util.*;

// public class Sort {

//     public static void printArray(int arr[]) {
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {

//         int arr[] = {7, 8, 3, 1, 2};

//         // Insertion Sort
//         for(int i = 1; i < arr.length; i++) {

//             int current = arr[i];
//             int j = i - 1;

//             // Move elements greater than current one position ahead
//             while(j >= 0 && arr[j] > current) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }

//             // Place current element in its correct position
//             arr[j + 1] = current;
//         }

//         printArray(arr);
//     }
// }