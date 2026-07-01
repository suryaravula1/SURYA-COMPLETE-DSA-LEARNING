class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        int left =0;
        int right =0;

        HashMap<Integer, Integer> windowMap = new HashMap<>();
        int dulicateCount =0;

        long currentSum =0;
        long maxSum =0;

        while(right< nums.length){

            currentSum += nums[right];

            windowMap.put(nums[right], windowMap.getOrDefault(nums[right],0)+1);

            if(windowMap.get(nums[right]) > 1){
                dulicateCount++;
            }
            if(right -left+1 > k){
                int leftNum = nums[left];

                if(windowMap.get(leftNum)>1){
                    dulicateCount--;
                }

                currentSum -= leftNum;
                windowMap.put(leftNum, windowMap.get(leftNum)-1);
                left++;
            }


            if(right - left + 1==k && dulicateCount==0){
                maxSum = Math.max(maxSum, currentSum);
            }

            right++;

        }

        return maxSum;

    }
}