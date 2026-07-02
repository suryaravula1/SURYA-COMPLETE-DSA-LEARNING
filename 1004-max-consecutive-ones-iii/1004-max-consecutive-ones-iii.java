class Solution {
    public int longestOnes(int[] nums, int k) {
        

        int left =0;
        int right =0;

        int noOfZeros=0;

        while(right< nums.length){
            if(nums[right]==0){
                noOfZeros++;
            }

            if(noOfZeros > k){
                if(nums[left]==0){
                    noOfZeros--;
                }

                left++;
            }

            right++;
        }


        return right-left;
    }
}