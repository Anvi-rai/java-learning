
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
import java.util.Scanner;

class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k] + "  " + "elem");
        }

    }

}
