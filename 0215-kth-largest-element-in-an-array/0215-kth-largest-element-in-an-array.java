class Solution {
    public int findKthLargest(int[] nums, int k) {
        
       Arrays.sort(nums);
               // Arrays.sort(nums, Collections.reverseOrder());

        
            return nums[nums.length-k];
        
    }
}
