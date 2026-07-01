class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxOnes =0;

        int left =0;
        int right = 0;

        while(right < nums.length){

            if(nums[right]==0){
                right++;
                left= right;
            }else{
                maxOnes = Math.max(maxOnes, right-left+1);
                right++;
            }


        }

        return maxOnes;
    }
}