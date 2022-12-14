package December;
import java.util.*;
public class fourteenDecember 
{
   
	
	public int rob(int[] nums) 
    {
      
        int dp[] = new int[nums.length];


        //recognising answer is not filled in it
        //for tracking maximum
        Arrays.fill(dp,-1);
       
        //invoking function
        return houseRobber(nums.length-1,nums,dp);
        
        
        
    }

    public int houseRobber(int n,int a[],int dp[]){
         
         //handling -ve value
        if(n<0) return 0;
          
          //base case
        if(n==0) return dp[n]=a[n];
          //checking answer is present in the array or not
        if(dp[n]!=-1) return dp[n];
         
         //recurrence relation
        return dp[n]=Math.max(a[n]+houseRobber(n-2,a,dp),houseRobber(n-1,a,dp));
    }
}
