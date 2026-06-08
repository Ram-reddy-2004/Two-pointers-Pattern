class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int left=0,right=0;
        HashSet<Character> set = new HashSet<>();
        while(right<s.length()){
            char c = s.charAt(right);
           if(!set.contains(c)){
                set.add(c);
                maxlen = Math.max(maxlen,right-left+1);
                right++;
           }else if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
           }
        }
        return maxlen;
    }
}