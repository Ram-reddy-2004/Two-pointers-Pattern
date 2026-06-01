class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<= numRows;i++){
            res.add(generateRow(i));
        }
        return res;
    }
    List<Integer> generateRow(int n ){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int val =1;
        for(int col =1; col < n; col++){
            val = val * (n-col);
            val = val / col;
            list.add(val);
        }
        return list;
    }
}