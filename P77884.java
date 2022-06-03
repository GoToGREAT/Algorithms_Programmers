
public class P77884 {
	class Solution {
	    public int solution(int left, int right) {
	    	int answer = 0;
	    	
	    	answer = (left+right)*(right-left+1)/2;
	    	int rootright = (int) Math.sqrt(right);
	    	int rootleft = (int) Math.sqrt(left);	    	
	    
	    	for(int i = rootleft; i<rootright+1; i++) {
	    		if(Math.pow(i,2)>=left & Math.pow(i,2)<=right) {
	    			answer = answer-(2*(int)Math.pow(i,2));
	    		}	    		
	    	}
	    	System.out.println(3.0>3);
	        
	        return answer;
	    }
	}
}
