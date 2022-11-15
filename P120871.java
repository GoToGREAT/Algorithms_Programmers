public class P120871 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        int now = 0;
	        
	        while(true) {
	        	now += 1;
	        	if(now%3==0) continue;
	        	else if(String.valueOf(now).contains("3")) continue;
	        	else answer++;    	
	        	
	        	if(answer == n) return now;
	        }
	     
	    }
	}
}