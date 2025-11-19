package Hashing;

import java.util.HashSet;

public class Keep_Multiplying_Found_Values_by_Two {
    public static int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        while (set.contains(original)) {
            original *= 2;
        }

        return original;
    }

    public static void main(String[] args) {
        int nums[] ={5,3,6,1,12};
        int original = 3;

        System.out.print("the o/p is -> "+ findFinalValue(nums,original));
    }
}
