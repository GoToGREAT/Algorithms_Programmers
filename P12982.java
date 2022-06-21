package programmers;

import java.util.Arrays;

public class P12982 {
	class Solution {
	    public int solution(int[] d, int budget) {
	    	Arrays.sort(d);
	    	int answer = 0;
	    	
	    	for(int i=0; i<d.length; i++) {
	    		budget -= d[i];
	    		answer++;
	    		if(budget<0) {
	    			answer--;
	    			break;
	    		}	    		
	    	}        
	        return answer;
	    }
	}
}
