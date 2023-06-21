package StackAssign2;

import java.util.*;

public class myStack1 {

	public static void main(String[] args) {
		
		 int a[] = { 1, 1, 2, 3, 4, 2, 1 };
	        int max = a[0];
	        for (int i = 0; i < a.length; i++)
	        {
	            if (a[i] > max){	// Getting the max element of the array
	                max = a[i];
	            }
	        }
	    
	        int freq[] = new int[max + 1];
	 
	        for (int i = 0; i < max + 1; i++)
	            freq[i] = 0;
	 
	        // Calculating frequency of each element
	        for (int i = 0; i < a.length; i++)
	        {freq[a[i]]++;
	        }
	        
	       greaterFreq(a,freq);		// Function call
	    }
		

	 public static void greaterFreq(int a[], int freq[])
	    {   int n = a.length;
	 
	        // stack to store the position of array element
	        Stack<Integer> s = new Stack<Integer>();
	        s.push(0);
	 
	        // res to store the value of next greater
	        // frequency element for each element
	        int res[] = new int[n];
	        for (int i = 0; i < n; i++)
	            res[i] = 0;
	 
	        for (int i = 1; i < n; i++)
	        {
	            /* If the frequency of the element which is
	                pointed by the top of stack is greater
	                than frequency of the current element
	                then push the current position i in stack*/
	 
	            if (freq[a[s.peek()]] > freq[a[i]])
	                s.push(i);
	            else
	            {   while (freq[a[s.peek()]] < freq[a[i]] && s.size() > 0)
	                {
	                    res[s.peek()] = a[i];
	                    s.pop();
	                }
	 
	             // now push the current element
	             s.push(i);
	            }
	        }
	 
	        while (s.size() > 0)
	        {   res[s.peek()] = -1;
	            s.pop();
	        }
	       
	        // Print the res list 
	        System.out.print(Arrays.toString(res));
	  }
	    
	 

}
