
// class Solution {
// public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//     int[] merged = new int[nums1.length + nums2.length];
//     int index = 0;
//     for (int x : nums1) {
//         merged[index++] = x;
//     }
//     for (int x : nums2) {
//         merged[index++] = x;
//     }
//     Arrays.sort(merged);
//     int n = merged.length;
//     if (n % 2 == 0) {
//         return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
//     } else {
//         return merged[n / 2];
//     }
// }
// public static void main(String[] args) {
//     Solution solution = new Solution();
//     int[] nums1 = {1, 3};
//     int[] nums2 = {2};
//     double median = solution.findMedianSortedArrays(nums1, nums2);
//     System.out.println("Median: " + median);
// }
//}
// class Solution {
//     public int maxArea(int[] height) {
// int maxArea = 0;
// int n = height.length;
// for (int i = 0; i < n; i++) {
//     for (int j = i + 1; j < n; j++) {
//         if (height[i] == 0 || height[j] == 0) {
//             continue;
//         }
//         int width = j - i;
//         int minHeight = Math.min(height[i], height[j]);
//         int area = width * minHeight;
//         maxArea = Math.max(maxArea, area);
//     }
// }
// return maxArea;
//         int maxArea = 0;
//         int left = 0;
//         int right = height.length - 1;
//         while (left < right) {
//             int width = right - left;
//             int minHeight = Math.min(height[left], height[right]);
//             int area = width * minHeight;
//             maxArea = Math.max(maxArea, area);
//             // Move the pointer pointing to the shorter line
//             if (height[left] < height[right]) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
//         return maxArea;
//     }
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//         int maxArea = solution.maxArea(height);
//         System.out.println("Max Area: " + maxArea);
//     }
// }
// class Solution {
//     // public int maxSubArray(int[] nums) {
//     //     int maxsum = nums[0];
//     //     int currentsum = nums[0];
//     //     for (int i = 1; i < nums.length; i++) {
//     //         currentsum = Math.max(nums[i], currentsum + nums[i]);
//     //         maxsum = Math.max(maxsum, currentsum);
//     //     }
//     //     return maxsum;
//     //}
//     static public int maxSubArraySum(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         int k = 3;
//         int n = nums.length;
//         int windowSum = 0;
//         for (int i = 0; i < n - k + 1; i++) {
//             windowSum += nums[i];
//             for (int j = i; j < i + k; j++) {
//                 windowSum += nums[i] - nums[i - k];
//             }
//             max = Math.max(max, windowSum);
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int maxSubArraySum = solution.maxSubArraySum(nums);
//         System.out.println("Max SubArray Sum: " + maxSubArraySum);
//     }
// }
// class Solution {
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 4, 5, 6, 7,};
//         int k = 3;
//         int even = 0;
//         for (int i = k; i < arr.length; i++) {
//             if (arr[i] % 2 == 0) {
//                 even++;
//             }
//         }
//         System.out.println(even);
//     }
//     else if(arr[i-k] % = 0) {
//         even--;
//         System.out.println(even);
//     }
// }
// 
import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                maxlen = Math.max(maxlen, set.size());
                set.clear();
                i--;
            } else {
                set.add(ch);
            }
        }

        maxlen = Math.max(maxlen, set.size());

        return maxlen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}
