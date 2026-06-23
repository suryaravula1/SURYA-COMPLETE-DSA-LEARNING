class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        HashMap<Character, Integer> map = new HashMap<>();

        int left =0;
        int right =0;
        int lengthOfSubString =0;

        while(right< s.length()){
            
            if(map.containsKey(s.charAt(right))){
                
                if(left <= map.get(s.charAt(right))){
                    left = map.get(s.charAt(right))+1;
                }
                
                map.put(s.charAt(right), right);
            }else{
                map.put(s.charAt(right), right);
            }
            lengthOfSubString = Math.max(lengthOfSubString, (right-left)+1);

            right++;

        }

        return lengthOfSubString;
    }
}