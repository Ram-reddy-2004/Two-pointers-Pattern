class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            count+= isPal(s,i,i);
            count+= isPal(s,i,i+1);
        }
        return count;
    }
    public int isPal(String s, int l,int r){
        int count=0;
       while(l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
        l--;
        r++;
        count++;
       }
       return count;
    }
}