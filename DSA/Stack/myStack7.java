package StackAssign2;

import java.util.*;

public class myStack7 {

	public static void main(String[] args) {
		 ArrayList<String> v = new ArrayList<>();
		 
	        v.add("tom"); v.add("jerry");
	        v.add("jerry");v.add("tomy");
	  
	 
	        System.out.println(removeConsecutiveSame(v));
	}
	
	public static int removeConsecutiveSame(ArrayList<String > v)
    {
		
		 Stack<String> st = new Stack<>();
	      
	        // Start traversing the sequence
	        for (int i=0; i<v.size(); i++)
	        {
	            // Push the current string if the stack is empty
	            if (st.empty())
	                st.push(v.get(i));
	            else
	            {   String str = st.peek();
	      
	                // compare the current string with stack top if equal, pop the top
	                if (str.equals(v.get(i)))   
	                    st.pop();
	      
	                // Otherwise push the current string
	                else
	                    st.push(v.get(i));
	            }
	        }
	      
	        // Return stack size
	        return st.size();
    }
     

}

