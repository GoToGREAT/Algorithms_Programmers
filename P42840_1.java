import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class P42840_1 {
	class Solution {
	    public int[] solution(int[] answers) {
	    	int[] a = {1,2,3,4,5};
	    	int[] b = {2,1,2,3,2,4,2,5};
	    	int[] c = {3,3,1,1,2,2,4,4,5,5};
	    	
	    	Map<Integer, Integer> score= new HashMap<Integer, Integer>();
	    	score.put(1, 0);
	    	score.put(2, 0);
	    	score.put(3, 0);	    	
	    	
	    	for(int ww=0; ww<answers.length; ww++) {
	    		if(answers[ww]==a[ww%5]) {
	    			int s = score.get(1);
	    			score.replace(1, s++);
	    		} 
	    		if(answers[ww]==b[ww%8]){
	    			int s = score.get(2);
	    			score.replace(2, s++);
	    		} 
	    		if(answers[ww]==c[ww%10]){
	    			int s = score.get(3);
	    			score.replace(3, s++);
	    		} 
	    	}
	    	
	    	int max = Collections.max(score.values());
	     	if(score.get(1)!=max) score.remove(1);
	     	if(score.get(2)!=max) score.remove(2);
	     	if(score.get(3)!=max) score.remove(3);
	     	
	     	int[] answer = new int[score.size()];
	     	Object[] t = score.values().toArray();
	     	
	     	for(int i=0; i<score.size(); i++) {
	     		answer[i] = score.get(t);
	     	}	     	
	        return answer;
	    }
	}
}
