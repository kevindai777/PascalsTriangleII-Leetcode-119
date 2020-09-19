//Java Solution

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0).add(1);
        
        if (rowIndex == 0) {
            return result.get(0);
        }
        
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            
            for (int j = 1; j < i; j++) {
                row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            
            row.add(1);
            result.add(row);
        }
        
        return result.get(rowIndex);
    }
}