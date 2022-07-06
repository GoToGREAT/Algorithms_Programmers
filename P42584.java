public class P42584 {
	class Solution {
	    public int[] solution(int[] prices) {
	    	int len = prices.length;
	    	
	        int[] answer = new int[len];
	        
	        for(int i=0; i<len; i++) {
	        	int cnt = 0;
	        	boolean down = false;        	
	        	
	        	for(int q=i+1; q<len; q++) {
	        		down = prices[i]>prices[q];
	        		cnt++;
	        		if(down) break;
	        	}
	        	answer[i] = cnt;
	        }        
	        
	        return answer;
	    }
	}
}