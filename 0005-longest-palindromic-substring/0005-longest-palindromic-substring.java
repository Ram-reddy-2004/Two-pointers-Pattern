class Solution {
    public String longestPalindrome(String s) {
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            int oddlen = isPal(s,i,i);
            int evenlen = isPal(s,i,i+1);
            int len = Math.max(oddlen,evenlen);
            if(len > end-start){
                start = i - (len - 1)/ 2;
                end = i + len / 2;
            }
        }
        return s.substring(start,end+1); 
    }

     int isPal(String s, int l, int r){
        while(l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}