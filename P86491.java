package programmers;

import java.util.Arrays;

public class P86491 {
	class Solution {
	    public int solution(int[][] sizes) {
	    	int[] max = new int[sizes.length];
	    	int[] min = new int[sizes.length];
	    	
	    	for(int i=0; i<sizes.length; i++) {
	    		int a = sizes[i][0];
	    		int b = sizes[i][1];
	    		if(a>b) {
	    			max[i]=a;
	    			min[i]=b;
	    		} else {
	    			max[i]=b;
	    			min[i]=a;
	    		}	    		
	    	}
	    	
	    	Arrays.sort(max);
	    	Arrays.sort(min);	        
	        
	        return max[sizes.length-1]*min[sizes.length-1];
	    }
	}
}
