import java.util.*;

/*
채점 결과
정확성: 65.0
합계: 65.0 / 100.0
 */


public class P17680_1 {
	class Solution {
	    public int solution(int cacheSize, String[] cities) {
	        int answer = 0;
	        
	        List<String> list = new LinkedList<>();      
	        
	        for(int i=0; i<cities.length; i++) {
	        	if(list.contains(cities[i].toUpperCase())) {
	        		answer += 1;
	        	}
	        	
	        	else answer += 5;
	        	
	        	list.add(cities[i].toUpperCase());	        		
	        	
	        	if(list.size()>cacheSize) {
	        		list.remove(0);
	        	}	        	
	        }
	        	        
	        return answer;
	    }
	}
}