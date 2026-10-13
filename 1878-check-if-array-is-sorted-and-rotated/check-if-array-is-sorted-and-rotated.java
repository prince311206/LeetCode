class Solution {
    public boolean check(int[] nums) {
        int countDrops = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                countDrops++;
            }
        }
        if (nums[n - 1] > nums[0]) {
            countDrops++;
        }
        if (countDrops <= 1) {
            return true;
        } else {
            return false;
        }
    }
}