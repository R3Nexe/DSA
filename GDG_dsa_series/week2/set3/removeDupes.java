class Solution {

    public int removeDuplicates(int[] nums) {
        int left = 0;

        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != nums[left]) {
                nums[left + 1] = nums[right];
                left++;
                count++;
            }
        }
        count++;
        return count;
    }
}
