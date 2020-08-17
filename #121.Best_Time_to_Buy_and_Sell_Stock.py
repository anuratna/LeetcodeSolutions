class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minprice = sys.maxsize
        maxprofit = 0
        
        for i in range(0,len(prices)):
            #iterating through the list to find the minimum value
            if prices[i]< minprice:
                minprice = prices[i]
                
            #finding the max difference
            elif  prices[i]-minprice> maxprofit:
                 maxprofit = prices[i]-minprice
        
        return maxprofit
            
