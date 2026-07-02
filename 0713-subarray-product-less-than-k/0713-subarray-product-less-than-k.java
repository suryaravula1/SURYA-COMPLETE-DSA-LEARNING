class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int preProduct =1;
        int left=0;
        int right =0;

        int numOfSubArrays =0;

        while(right< nums.length){
            preProduct *= nums[right];

            while(preProduct >= k){
                preProduct /= nums[left];
                left++;
            }

            numOfSubArrays += right -left +1;

            right++;

        }


        return numOfSubArrays;
    }
}