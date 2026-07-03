class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        

        int minSum =Integer.MAX_VALUE;

        int left =0;
        int right =0;

        int currentSum =0;

        while(right< nums.length){
            currentSum += nums[right];

            while(currentSum >= target){
                minSum = Math.min(minSum, right - left+1);
                currentSum -= nums[left];
                left++;
            }

            right++;
        }

        if(minSum == Integer.MAX_VALUE){
            return 0;
        }

        return minSum;
    }
}