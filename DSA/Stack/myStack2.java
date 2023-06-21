package StackAssign2;

import java.util.*;

public class myStack2 {

	public static void main(String[] args) {
		Stack<Integer> input = new Stack<Integer>();
        input.add(44);
        input.add(31);
        input.add(3);
        input.add(78);
        input.add(92);
        input.add(13);
     
        // Temporary stack 
        Stack<Integer> tmpStack=sortstack(input);
       
       System.out.print('[');
       
        while (!tmpStack.empty())
        {
            System.out.print(tmpStack.pop()+", ");
        }
               System.out.print(']');

	}
	
	
	 public static Stack<Integer> sortstack(Stack<Integer> input)
	    {
	        Stack<Integer> tmpStack = new Stack<Integer>();
	        while(!input.isEmpty())
	        {
	            // pop out the first element
	            int tmp = input.pop();
	         
	            // while temporary stack is not empty and top of stack is lesser than temp
	            while(!tmpStack.isEmpty() && tmpStack.peek() < tmp)
	            { // pop from temporary stack and push it to the input stack
	              input.push(tmpStack.pop());
	            }
	             
	            // push temp in temporary of stack
	            tmpStack.push(tmp);
	        }
	        return tmpStack;
	    }
	     

}
