package StackAssign2;

import java.util.*;

public class myStack5 {

	 // Stack to maintain order of digits
    static Stack<Integer> st= new Stack<>();
 
	
	public static void main(String[] args) {

        int number = 12345;
        System.out.println(reverse_number(number));

	}
	
	
    // Function to push numbers into stack
   public static void push_num(int number)
    {
        while(number != 0)
        {st.push(number % 10);
         number = number / 10;
        }
    }
 
    // Function to reverse the number
   public static int reverse_number(int number)
    {
        push_num(number);		 // Function call to push number's
        int reverse = 0;
        int m = 1;

        while (!st.isEmpty())
        {
            reverse = reverse + (st.peek() * m);
            st.pop();
            m = m * 10;
        }
        return reverse;           // Return the reversed number formed
    }

}
