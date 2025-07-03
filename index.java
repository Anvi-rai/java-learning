
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
class index {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5,};
        int[] arr2 = {4, 2, 4, 2, 4};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Common element: " + arr1[i]);
                    break;
                }
            }
        }

    }
} // int max = arr1[0] + arr2[0];
// for (int i = 0; i < arr1.length; i++) {
//     for (int j = 0; j < arr2.length; j++) {
//         if (arr1[i] + arr2[j] > max) {
//             max = arr1[i] + arr2[j];
//         }
//     }
// }
// System.out.println(max);
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

