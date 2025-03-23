class Solution {
    List<List<String>> res;
    HashSet<Integer> col;
    HashSet<Integer> rdiagonal;
    HashSet<Integer> ldiagonal;

    public void solve(List<String> adj, int row, int n) {
        if (row == n) {
            res.add(new ArrayList<>(adj));
            return;
        }

        for (int c = 0; c < n; c++) {
            if (!col.contains(c) && !rdiagonal.contains(row + c) && !ldiagonal.contains(row - c)) {
                
                // Place the queen
                StringBuilder str = new StringBuilder(adj.get(row));
                str.setCharAt(c, 'Q');
                adj.set(row, str.toString());

                col.add(c);
                rdiagonal.add(row + c);
                ldiagonal.add(row - c);

                // Recur for the next row
                solve(adj, row + 1, n);

                // Backtrack and remove the queen
                str.setCharAt(c, '.');
                adj.set(row, str.toString());

                col.remove(c);
                rdiagonal.remove(row + c);
                ldiagonal.remove(row - c);
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<String> adj=new ArrayList<>();
        res=new ArrayList<>();
        col=new HashSet<>();
        rdiagonal=new HashSet<>();
        ldiagonal=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            StringBuilder str=new StringBuilder();
            for(int j=0;j<n;j++)
            {
                
                str.append(".");
            }

            adj.add(str.toString());
        } 

        solve(adj,0,n);     
        return res; 
    }
}