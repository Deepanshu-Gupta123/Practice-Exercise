public class Pratice_StockBuyAndSell {
    public static void main(String[] args) {
        // int profit = 0, currProfit = 0;

        // int[] num = { 7, 1, 5, 3, 6, 4 };
        // int n = num.length;
        // for (int i = 0; i < n; i++) {
        // for (int j = i; j >= 0; j--) {
        // currProfit = num[i] - num[j];
        // profit = Math.max(profit, currProfit);
        // }
        // }
        // return profit;

        // int[] num = { 7, 1, 5, 3, 6, 4 };
        // int n=num.length,profit=0,maxProfit=0;
        // int[] newArr= new int[n];
        // newArr[n-1]=num[n-1];
        // for(int i=n-2;i>=0;i--){
        // newArr[i]=Math.max(num[i], newArr[i+1]);
        // }
        // System.out.println(newArr);
        // for(int i=0;i<n;i++){
        // profit=newArr[i]-num[i];
        // maxProfit=Math.max(maxProfit, profit);
        // }
        // System.out.println(maxProfit);

        int[] num = { 7, 1, 5, 3, 6, 4 };
        int n = num.length, minprofit = num[0], maxProfit = 0;
        for (int i = 1; i < n; i++) {
            minprofit = Math.min(num[i], minprofit);
            int profit = num[i] - minprofit;
            maxProfit = Math.max(profit, maxProfit);
        }
        System.out.println(maxProfit);
    }

}
