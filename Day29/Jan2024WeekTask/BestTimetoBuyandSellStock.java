public class BestTimetoBuyandSellStock {
    public int BestProfit(int[] prices){
        int minPrice=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else{
                int profit=prices[i]-minPrice;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        BestTimetoBuyandSellStock solution = new BestTimetoBuyandSellStock();
        int[] prices1={7,1,5,3,6,4};
        System.out.println("Max Profit: " + solution.BestProfit(prices1)); 
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit: " + solution.BestProfit(prices2));

    }
}
