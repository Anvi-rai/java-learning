
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
class Solution {

    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int currentsum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentsum = Math.max(nums[i], currentsum + nums[i]);
            maxsum = Math.max(maxsum, currentsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSubArraySum = solution.maxSubArray(nums);
        System.out.println("Max Subarray Sum: " + maxSubArraySum);
    }
}
