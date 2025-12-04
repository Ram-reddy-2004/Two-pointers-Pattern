class Solution {
    public String reverseWords(String s) {
        String[] res = s.split("\\s+");
        int n = res.length;
        for(int i=0;i<n/2;i++){
            String temp = res[i];
            res[i]= res[n-i-1];
            res[n-i-1] = temp;
        }
        List<String> resu = new ArrayList<>(Arrays.asList(res));
        return String.join(" ",resu).strip();

    }
}