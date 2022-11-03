import java.util.*;

public class P120882 {
	class Solution {
	    public int[] solution(int[][] score) {
	        
	    	int[] copyScore = new int[score.length];
	    	
	    	for(int i=0; i<score.length; i++) {
	    		copyScore[i] = score[i][0]+score[i][1];    		
	    	}
	    	
	    	int[] arrScore = copyScore.clone();
	    	
	    	Arrays.sort(arrScore);
	    	
	    	HashMap<Integer, Integer> map = new HashMap<>();
	    	
	    	int arr = 0;
	    	
	    	for(int i=score.length-1; i>=0; i--) {
	    		arr++;
	    		if(i==score.length-1) {
	    			map.put(arrScore[i], arr);
	    		} else if(arrScore[i]==arrScore[i+1]) {
	    			continue;
	    		} else {
	    			map.put(arrScore[i], arr);
	    		}
	    	}    	
	    	
	    	int[] answer = new int[score.length];
	        
	        for(int i=0; i<copyScore.length; i++) {
	        	answer[i] = map.get(copyScore[i]);
	        }     
	        
	        
	        return answer;
	    }
	}
}