package December;
import java.util.*;

public class fifteenDec {

	
	
	 public int longestCommonSubsequence(String text1, String text2) 
	    {
	          int dp[][] = new int[text1.length()][text2.length()];

	          for(int i=0;i<text1.length();i++){

	            Arrays.fill(dp[i],-1);
	          }
	         
	          return length(text1.length()-1,text2.length()-1,text1,text2,dp);

	    }

	    public int length(int i,int j,String s1,String s2,int dp[][]){

	        if(i<0 || j<0) return 0;

	        if(dp[i][j]!=-1) return dp[i][j];
	        
	        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]= 1+length(i-1,j-1,s1,s2,dp);

	         return dp[i][j]=Math.max(length(i-1,j,s1,s2,dp),length(i,j-1,s1,s2,dp));

	    }
}
