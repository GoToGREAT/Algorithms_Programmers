import java.util.*;

public class P42586 {
	class Solution {
	    public int[] solution(int[] progresses, int[] speeds) {
	    	int cnt = 0;
	    	
	    	int day = progresses.length;
	    	
	    	boolean finish = false;
	    	
	    	List<Integer> work = new ArrayList<>();
	    	
	    	if(finish==false) {
	    		while(finish==false) {
	    			int start = cnt;
	    			
	    			int count = 0;
	    			
	    	    	int days = (100-progresses[start]) % speeds[start] > 0 ? ( (100-progresses[start]) / speeds[start]) +1 : (100-progresses[start]) / speeds[start];
		    	   	
	    	    	for(int i=start; i<day; i++) {
	    	    		progresses[i] = progresses[i]+days*speeds[i];
	    	    	}
	    	    	
	    	    	for(int i=start; i<day; i++) {
	    	    		if(progresses[i] >= 100) count++;
	    	    		else break;
	    	    	}
	    	    	
	    	    	work.add(count);
	    	    	cnt += count;
	    	    	if(cnt==day) finish = true;
		    	}
	    	}
	    	
	    	Object[] pre_answer = work.toArray();
	    	
	        int[] answer = new int[pre_answer.length];
	        
	        for(int i=0; i<answer.length; i++) {
	        	answer[i] = (int) pre_answer[i];
	        }
	        return answer;
	    }
	}
}
