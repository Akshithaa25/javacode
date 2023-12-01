// A class to represent a share trader
class ShareTrader {
    // A static variable to store the maximum profit
    static int maxProfit;

    // A static method to find the maximum profit from at most two transactions
    static void findMaxProfit(int[] price) {
        // Initialize the maximum profit to zero
        maxProfit = 0;
        // Get the length of the price array
        int n = price.length;
        // Create an array to store the maximum profit from one transaction
        // from left to right
        int[] profitLeft = new int[n];
        // Create an array to store the maximum profit from one transaction
        // from right to left
        int[] profitRight = new int[n];
        // Find the minimum price from left to right
        int minPrice = price[0];
        // Iterate over the price array from left to right
        for (int i = 1; i < n; i++) {
            // Update the minimum price if needed
            minPrice = Math.min(minPrice, price[i]);
            // Update the maximum profit from one transaction from left to right
            // by comparing the current profit and the previous profit
            profitLeft[i] = Math.max(profitLeft[i - 1], price[i] - minPrice);
        }
        // Find the maximum price from right to left
        int maxPrice = price[n - 1];
        // Iterate over the price array from right to left
        for (int i = n - 2; i >= 0; i--) {
            // Update the maximum price if needed
            maxPrice = Math.max(maxPrice, price[i]);
            // Update the maximum profit from one transaction from right to left
            // by comparing the current profit and the previous profit
            profitRight[i] = Math.max(profitRight[i + 1], maxPrice - price[i]);
        }
        // Iterate over the price array and find the maximum profit from two transactions
        // by adding the maximum profit from left and right at each index
        for (int i = 0; i < n; i++) {
            // Update the maximum profit if needed
            maxProfit = Math.max(maxProfit, profitLeft[i] + profitRight[i]);
        }
    }

    // A main method to test the program
    public static void main(String[] args) {
        // An array of stock prices
        int[] price = {10, 22, 5, 75, 65, 80};
        // Call the static method with the price array
        findMaxProfit(price);
        // Print the maximum profit
        System.out.println("The maximum profit is: " + maxProfit);
}
}