class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int right =0;
        int sumSoFar =0;

        HashSet<Integer> seen = new HashSet<>();
        int prevReminder=0;
        while(right < nums.length){
            sumSoFar += nums[right];
            int reminder = sumSoFar % k;

            if(right !=0 && seen.contains(reminder)){
                return true;
            }

            seen.add(prevReminder);
            prevReminder = reminder;
            right++;
        }


        return false;
    }
}