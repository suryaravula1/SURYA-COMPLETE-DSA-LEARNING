class Solution {
    public int characterReplacement(String s, int k) {
        

        int[] frequencyArray = new int[26];
        int maxFreqentChar =0;
        int left=0;
        int maximumLength =0;



        for(int right =0; right<s.length(); right++){
            int rightChar = s.charAt(right);
            frequencyArray[rightChar -'A']++;
            maxFreqentChar =Math.max(maxFreqentChar, frequencyArray[rightChar -'A'] );
            
            int currentWindowLength = (right-left)+1;

            if((currentWindowLength - maxFreqentChar) >k){
                frequencyArray[s.charAt(left) -'A']--;
                left++;
            }
            
            maximumLength = Math.max(maximumLength, (right-left)+1);



        
        }


        return maximumLength;
    }
}