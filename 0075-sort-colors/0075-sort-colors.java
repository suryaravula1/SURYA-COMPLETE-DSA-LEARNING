class Solution {
    public void sortColors(int[] nums) {
        

        int right = nums.length-1;
        int left =0;
        int current =0;

        while(current <= right){
            if(nums[current]==0){
                nums[current] = nums[left];
                nums[left] = 0;
                left++;
                current++;
            }else if( nums[current]==2){

                nums[current] = nums[right];
                nums[right] = 2;
                right--;
            }else{
                current++;
            }
        }

    
    }
}