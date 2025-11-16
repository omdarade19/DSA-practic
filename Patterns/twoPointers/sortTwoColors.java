public static void sortColors(int[] nums) {
    int i = 0, j = nums.length - 1;

    while (i < j) {

        while (i < j && nums[i] == 0) i++;
        while (i < j && nums[j] == 1) j--;

        if (i < j && nums[i] == 1 && nums[j] == 0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}

public static void main(String[] args) {
    int nums[] = {0, 1, 0, 1, 1, 1, 0, 1};

    sortColors(nums);

    for (int num : nums) {
        System.out.print(num + " ");
    }
}
