
// public class index {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 7};
//         int max = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter the size of the array:");
//         int n = in.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = in.nextInt();
//         }
//         // for (int k = 0; k < arr.length; k++) {
//         //     System.out.println(arr[k] + "  " + "elem");
//         // }
//         //     int max = arr[0];
//         //     for (int i = 0; i < arr.length; i++) {
//         //         if (arr[i] > max) {
//         //             max = arr[i];
//         //         }
//         //     }
//         //     System.out.println(max);
//         // }
//         int min = arr[0];
//         for (int k = 0; k < arr.length; k++) {
//             if (arr[k] < min) {
//                 min = arr[k];
//             }
//         }
//         System.out.println(min);
//     }
// }
// class index {
//     void Max() {
//         System.out.println("hehehehe");
//     }
//     public static void main(String[] args) {
//        index obj = new index();
//        obj.Max();
//     }
// }
// class index {

//     public static void main(String[] args) {
//         int[] arr1 = {1, 2, 3, 4, 5,};
//         int[] arr2 = {4, 2, 4, 2, 4};
//         for (int i = 0; i < arr1.length; i++) {
//             for (int j = 0; j < arr2.length; j++) {
//                 if (arr1[i] == arr2[j])
//                  {
//                     System.out.println("Common element: " + arr1[i]);
//                     break;
//                 }
//             }
//         }
//         int maximum = 0;
//         for (int i = 0; i < arr1.length; i++) {
//             if (arr1[i] > maximum) {
//                 maximum = arr1[i];
//             }
//         }
//         for (int i = 0; i < arr2.length; i++) {
//             if (arr2[i] > maximum) {
//                 maximum = arr2[i];
//             }
//         }
//         System.out.println("Maximum element: " + maximum);
//     }
// }



 // int[] marge = new int[arr1.length + arr2.length];
// for (int i = 0; i < arr1.length; i++) {
//     marge[i] = arr1[i];
// }
// for (int i = 0; i < arr2.length; i++) {
//     marge[arr1.length + i] = arr2[i];
// }
// for (int i = 0; i < marge.length; i++) {
//     System.out.println(marge[i]);
// }
//         int sum = 0
;
//         for (int i = 0; i < arr1.length; i++) {
//             sum = sum + arr1[i] + arr2[i];

//             // for (int j = 0; j < arr2.length; j++) {
//             //     if (arr1[i] == arr2[j]) {
//             //         sum += arr1[i];
//             //         break; // To avoid adding the same element multiple times
//             //     }
//             // }
//         }
//         System.out.println(sum);
// class index {
//     public static void main(String[] args) {
//         int arr1[] = {1, 2, 3,};
//         int arr2[] = {3, 4, 5,};
//         System.out.println("unique elements :");
//         //arr1 element not in arr2 
//         for (int i = 0; i < arr1.length; i++) {
//             boolean found = false;
//             for (int j = 0; j < arr2.length; j++) {
//                 if (arr1[i] == arr2[j]) {
//                     found = true;
//                     return;
//                 }
//             }
//             if (found == false) {
//                 System.out.println(arr1[i]);
//             }
//         }
//     }
// }
class index {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //    System.out.println();
        // }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of row " + i + ": " + sum);
        }
    }
}
