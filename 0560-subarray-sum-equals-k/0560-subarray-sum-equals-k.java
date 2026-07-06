class Solution {
    public int subarraySum(int[] nums, int k) {
        
        if(nums == null || nums.length ==0){
            return 0;
        }



        int noOfSumArrays =0;
        int prefixSum =0;

        HashMap<Integer, Integer> frequencySum = new HashMap<>();
        frequencySum.put(0,1);

        for(int num : nums){
            prefixSum += num;

            if(frequencySum.containsKey(prefixSum - k)){
                noOfSumArrays += frequencySum.get(prefixSum - k);
            }

            frequencySum.put(prefixSum,frequencySum.getOrDefault(prefixSum, 0)+1);
            
        }

        return noOfSumArrays;
    }


    
}