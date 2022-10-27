import java.util.*;
import java.util.stream.*;

/*
채점 결과
정확성: 58.8
합계: 58.8 / 100.0
 */

public class P133502 {
	class Solution {
	    public int solution(int[] ingredient) {
	        int answer = 0;
	        
	        List<Integer> list = Arrays.stream(ingredient).boxed().collect(Collectors.toList());
	       
	        
	        int start = 0;
	        
	        while(true) {	        	
	        	if(start == list.size()-3) break;
	        	
	        	if(list.get(start)==1 && list.get(start+1)==2
	        			&& list.get(start+2)==3 && list.get(start+3)==1) {
	        		answer++;
	        		list.remove(start+3);
	        		list.remove(start+2);
	        		list.remove(start+1);	        		
	        		list.remove(start);
	        		
	        		if(list.size()<4) break;
	        		
	        		start=0;
	        	} else {
	        		start++;
	        	}
	        }
	        
	        return answer;
	    }
	}
}