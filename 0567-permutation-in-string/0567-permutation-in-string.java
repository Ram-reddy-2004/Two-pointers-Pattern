class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] ar1 = new int[26];
        int[] ar2 = new int[26];
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            ar1[ch - 'a']++;
        }

        int l=0;
        for(int r =0;r<s2.length();r++){
            char ch = s2.charAt(r);
            ar2[ch - 'a']++;
            if(r-l+1 > s1.length()){ // shrinking condition...
                int lch = s2.charAt(l);
                ar2[lch - 'a']--;
                l++; 
            }
            if(r-l+1 == s1.length()){
                boolean isMatch = true;
                for(int i=0;i<26;i++){
                    if(ar1[i] != ar2[i]){
                        isMatch = false;
                        break;
                    }
                }
                if(isMatch) return true;
            }
        }
        return false;
    }
    
}
