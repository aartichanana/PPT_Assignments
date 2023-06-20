package stackprob;

import java.util.Stack;
import java.util.Arrays;

public class stack6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] ar1 = {100, 80, 60, 70, 60, 75, 85}; 
		System.out.println(Arrays.toString(calculateSpan(ar1, ar1.length)));

	}
	
	public static int[] calculateSpan(int price[],int n) {
		
		int[] ans = new int[n];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		
		ans[0]=1;
		for(int i=1; i<n; i++) {
			while(!st.isEmpty() && price[st.peek()]<=price[i]) {
				st.pop();
				
			}
			
			if(st.isEmpty()) {
				ans[i] = i+1;
				}
			
			else {
				ans[i] = i- st.peek();
			}
			st.push(i);
		}
				
		return ans;
	}
}



//Design an algorithm that collects daily price quotes for some stock and returns **the span** of that stock's price for the current day.
//
//The **span** of the stock's price in one day is the maximum number of consecutive days (starting from that day and going backward) for which the stock price was less than or equal to the price of that day.
//
//- For example, if the prices of the stock in the last four days is `[7,2,1,2]` and the price of the stock today is `2`, then the span of today is `4` because starting from today, the price of the stock was less than or equal `2` for `4` consecutive days.
//- Also, if the prices of the stock in the last four days is `[7,34,1,2]` and the price of the stock today is `8`, then the span of today is `3` because starting from today, the price of the stock was less than or equal `8` for `3` consecutive days.
//
//Implement the `StockSpanner` class:
//
//- `StockSpanner()` Initializes the object of the class.
//- `int next(int price)` Returns the **span** of the stock's price given that today's price is `price`.
