class Solution {
    public String removeOuterParentheses(String s) {
        int cout=0;
        String res = "";
        for(char c : s.toCharArray()){
            if("(".equals(c+"")){
                cout++;
                if(cout > 1) res+="(";
            } 
            else if(")".equals(c+"")) {
                cout--;
                if(cout > 0) res+=")";
            }
        }
        return res;
    }
}