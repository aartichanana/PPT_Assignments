package StackAssign2;

import java.util.*;
public class myStack3 {

	public static void main(String[] args) {
		 Stack<Integer> st = new Stack<Integer>();
	        st.push(1);
	        st.push(2);
	        st.push(3);
	        st.push(4);
	        st.push(5);
	        st.push(6);
	    
	        ArrayList<Integer> ar = new ArrayList<Integer>();
	        while (!st.empty()) {
	            ar.add(st.pop());
	        }
	        int n = ar.size();
	        // for even length of array	        
	        if (n % 2 == 0) {
	            int target = (n / 2);
	            for (int i = 0; i < n; i++) {
	                if (i == target) continue;	//ignore middle element 
	                st.push(ar.get(i));
	            }
	        } 
	        // for odd length of array	
	        else {
	            int target = (int) Math.ceil(n / 2);
	            for (int i = 0; i < n; i++) {
	                if (i == target) continue;	//ignore middle element 
	                st.push(ar.get(i));
	            }
	        }
	       // print the elements except the middle
	        while (!st.empty()) {
	            int p = st.pop();
	            System.out.print(p + " ");
	        
	         }      
	    

	    }

	}


