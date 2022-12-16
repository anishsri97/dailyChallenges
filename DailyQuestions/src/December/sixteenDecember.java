package December;
import java.util.*;

public class sixteenDecember 
{
	private Stack<Integer> stk = null;
    private Stack<Integer> rev=null;

   public MyQueue() 
    {
       stk = new Stack<>();
       rev= new Stack<>();   
   }
   
   public void push(int x) 
   {
        stk.push(x);    
   }
   
   public int pop() 
   {
       while(!stk.isEmpty())
       {
            rev.push(stk.pop());
       }
       int x= rev.pop();

       while(!rev.isEmpty()){
           stk.push(rev.pop());
       }
       return x;
   }
   
   public int peek() 
   {
       while(!stk.isEmpty())
       {
            rev.push(stk.pop());
       }
       int x= rev.peek();

       while(!rev.isEmpty()){
           stk.push(rev.pop());
       }
       return x;    
   }
   
   public boolean empty() {
       
       return (stk.isEmpty())?true:false;
   }
	
	
	
	
	
	
}
