package December;
import java.util.*;
import java.io.*;	

public class seventeenDecember {

	
	public static void main(String args[]) {
		
		
		String ar[] = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		
        final  Stack<Integer>  stk =  new Stack<>();
		
		
		for(String tokens:ar){

            switch(tokens)
            {

                 case "+":
                 int a = stk.pop();
                 int b = stk.pop();
                 stk.push(a+b);
                 break;


                 case "-":
                 int x = stk.pop();
                 int y = stk.pop();
                 stk.push(y-x);
                 break;

                 case "*":
                 int c = stk.pop();
                 int d = stk.pop();
                 stk.push(c*d);
                 break;

                 case "/":
                 int m = stk.pop();
                 int n = stk.pop();
                 stk.push(n/m);
                 break;

                 default:
                 stk.push(Integer.valueOf(tokens));


            }
        }

         System.out.println(stk.peek());
	}
}
