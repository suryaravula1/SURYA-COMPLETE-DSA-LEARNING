class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();

        int r=0;
        int l=0;
        long sum=0;
        long res=0;
        while(r<nums.length){
            if(!st.contains(nums[r])){
                sum+=nums[r];
                st.add(nums[r]);
                
                if((r-l+1)==k){
                    res= Math.max(sum,res);
                    sum-=nums[l];
                    st.remove(nums[l]);
                    l++;
                }
            
            }else{
                while(nums[l]!=nums[r]){
                    sum-=nums[l];
                    st.remove(nums[l]);
                    l++;
                }
                l++;
            }
      
            r++;

        }

        return res;
    }
}