class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minimum = float(inf)
        profit = 0

        for price in prices:
            if price < minimum:
                minimum = price
            
            else:
                profit = max(profit,price-minimum)
        
        return profit

        