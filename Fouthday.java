
import java.util.ArrayList;

class Fouthday {

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);
        arr1.add(2, 7);
        arr1.set(2, 12);
        arr1.remove(1);
        System.out.println(arr1.contains(1));

        // for (int i = 0; i < arr1.size(); i++) {
        //     System.out.println(arr1.get(i));
        // }
        // int max = arr1.get(0);
        // for (int i = 0; i < arr1.size(); i++) {
        //     if (arr1.get(i) > max) {
        //         max = arr1.get(i);
        //     }
        // }
        // System.out.println("Maximum value: " + max);
        // int min = arr1.get(0);
        // for (int i = 0; i < arr1.size(); i++) {
        //     if (arr1.get(i) < min) {
        //         min = arr1.get(i);
        //     }
        // }
        // System.out.println("Minimum value: " + min);
        // int odd = 0;
        // int even = 0;
        // for (int var : arr1) {
        //     if (var % 2 == 0) {
        //         even++;
        //     }
        //      else {
        //         odd++;
        //     }
        // }
        // System.err.println("odd:" + odd);
        // System.err.println("even:" + even);
    }
}
