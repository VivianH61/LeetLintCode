class Solution {
    public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1;
        int i = 0;
        while (i <= r) {
            if (nums[i] == 0) {
                swap(nums, i++, l++);
            } else if (nums[i] == 2) {
                swap(nums, i, r--);
            } else {
                i++;
            }
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int prev = nums[i];
        nums[i] = nums[j];
        nums[j] = prev;
    }
}