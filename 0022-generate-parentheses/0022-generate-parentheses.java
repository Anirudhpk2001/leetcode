import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> res = new ArrayList<>();

    public void Backtrack(String current, int open, int close, int n) {
        // Base case: If open and close are equal to n, we've generated a valid combination
        if (open == n && close == n) {
            res.add(current);
            return;
        }

        // If we can add more open parentheses, add '(' and recurse
        if (open < n) {
            Backtrack(current + "(", open + 1, close, n);
        }

        // If we can add more close parentheses (but only if there are unmatched open parentheses)
        if (close < open) {
            Backtrack(current + ")", open, close + 1, n);
        }
    }

    public List<String> generateParenthesis(int n) {
        Backtrack("", 0, 0, n);  // Start with an empty string and 0 open/close parentheses
        return res;
    }
}
