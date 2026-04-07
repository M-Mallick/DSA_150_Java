class Solution {
    public int findClosestNumber(int[] nums) {
        int min_distance = Integer.MAX_VALUE;
        int valid_value = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            int dist = Math.abs(0 - nums[i]);
            if(min_distance > dist) {
                min_distance = dist;
                valid_value = nums[i];
            }
            else if(min_distance == dist) {
                valid_value = Math.max(valid_value, nums[i]);
            }
        }
        return valid_value;
    }
}
