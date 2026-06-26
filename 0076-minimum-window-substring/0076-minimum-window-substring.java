class Solution {
    public String minWindow(String s, String t) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        int need =0;
        int have =0;

        int minLength = Integer.MAX_VALUE;
        int minStartIndex =0;

        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c) ==1){
                have++;
            }
        }

        int left =0;
        int right=0;

        while(right< s.length()){
            char currentChar = s.charAt(right);
            if(map.containsKey(currentChar)){
                map.put(currentChar, map.get(currentChar)-1);
                if(map.get(currentChar)==0){
                    need++;
                }
            }

            while(need == have){

                if((right-left)+1 <minLength ){
                    minLength = (right-left)+1;
                    minStartIndex= left;
                }
                
                
                if(map.containsKey(s.charAt(left))){
                    map.put(s.charAt(left), map.get(s.charAt(left))+1);
                    if(map.get(s.charAt(left))>0){
                        need--;
                    }
                }

                left++;
                
                
            }

            right++;

        }

        if(minLength == Integer.MAX_VALUE){
            return "";
        }

        return s.substring(minStartIndex, minStartIndex+minLength);


    }
}