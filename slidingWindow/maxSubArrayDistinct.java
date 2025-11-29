package slidingWindow;

import java.util.HashMap;

public class maxSubArrayDistinct {

    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        long windowSum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            int curr = nums[right];

            freq.put(curr, freq.getOrDefault(curr, 0) + 1);
            windowSum += curr;

            if (right - left + 1 > k) {
                int remove = nums[left];
                freq.put(remove, freq.get(remove) - 1);
                if (freq.get(remove) == 0) freq.remove(remove);
                windowSum -= remove;
                left++;
            }

            if (right - left + 1 == k) {
                if (freq.size() == k) {
                    maxSum = Math.max(maxSum, windowSum);
                }
            }
        }

        return maxSum;
    }

    // ---------------------- MAIN METHOD ------------------------
    public static void main(String[] args) {
        maxSubArrayDistinct obj = new maxSubArrayDistinct();

        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;

        long ans = obj.maximumSubarraySum(nums, k);

        System.out.println("Maximum Sum of Distinct Subarray of Size " + k + " = " + ans);
    }
}
