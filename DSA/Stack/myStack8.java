package StackAssign2;

import java.util.*;

public class myStack8 {

	public static void main(String[] args) {

        int arr[] = {2, 4, 8, 7, 7, 9, 3};
        int n = arr.length;
        System.out.println(findMaxDiff(arr, n));

	}
	 // Function to fill left smaller element 
    static void leftSmall(int arr[], int n, int SE[])
    {
    
        Stack<Integer> S = new Stack<>();
 
        // Traverse all array elements
        for (int i = 0; i < n; i++)
        {
            
            while (!S.empty() && S.peek() >= arr[i])
            {
                S.pop();
            }
 
            // Store the smaller element of current element
            if (!S.empty())
            {
                SE[i] = S.peek();
            }
            // If all elements in S were greater than arr[i]
            else
            {
                SE[i] = 0;
            }
 
            // Push this element
            S.push(arr[i]);
        }
    }
 
    // Function returns maximum difference b/w Left & right smaller element
    static int findMaxDiff(int arr[], int n)
    {
        int[] LS = new int[n]; // To store left smaller elements
 
        // find left smaller element of every element
        leftSmall(arr, n, LS);
 
        // find right smaller element of every element
        // first reverse the array and do the same process
        int[] RRS = new int[n]; // To store right smaller elements in reverse array
        
        reverse(arr);
        leftSmall(arr, n, RRS);
 
        // maximum absolute difference
        int result = -1;
        for (int i = 0; i < n; i++)
        {
            result = Math.max(result, Math.abs(LS[i] - RRS[n - 1 - i]));
        }
 
        // return maximum difference b/w LS & RRS
        return result;
    }
 
    static void reverse(int a[])
    {
        int i,n = a.length;
        int t;
        for (i = 0; i < n / 2; i++)
        {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }

   }
