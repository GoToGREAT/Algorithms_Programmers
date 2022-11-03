import java.util.*;

public class P120880_1 {
	class Solution {
	    public int[] solution(int[] numlist, int n) {
	    	Arrays.sort(numlist);
	    	
	        int[] answer = new int[numlist.length];  
	        	        
	        List<Integer> under = new ArrayList<>();
	        List<Integer> over = new ArrayList<>();
	        
	        for(int i=0; i<numlist.length; i++) {
	        	if(numlist[i] >= n) {
	        		over.add(numlist[i]);
	        	} else under.add(0, numlist[i]);
	        }	        
	        
	        int now = 0;
	        
	        while(under.size() > 0 || over.size() > 0) {
	        	
	        	if(under.size()==0) {
	        		answer[now++] = over.get(0);
	        		over.remove(0);
	        	} else if(over.size() == 0) {
	        		answer[now++] = under.get(0);
	        		under.remove(0);
	        	} else {
	        		if(Math.abs(under.get(0)-n) >=  Math.abs(over.get(0)-n)) {
	        			answer[now++] = over.get(0);
		        		over.remove(0);
	        		} else {
	        			answer[now++] = under.get(0);
		        		under.remove(0);
	        		}
	        	} 	
	        	
	        }
	        
	        return answer;
	    }
	}
}