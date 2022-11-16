import java.util.*;

/*
채점 결과
정확성: 65.0
합계: 65.0 / 100.0
 */


public class P17680_2 {
	class Solution {
	    public int solution(int cacheSize, String[] cities) {
	        int answer = 0;
	        
	        List<String> list = new LinkedList<>();	        
	        
	        for(int i=0; i<cities.length; i++) {
	        	boolean now = false;
	        	for(int q=0; q<list.size(); q++) {
	        		if(list.get(q).equals(cities[i].toUpperCase())) {
	        			answer += 1;
	        			list.remove(q);
	        			now = true;
	        		}
	        	}
	        		
	        		if(!now) {
	        			answer += 5;		        			
	        		}
	        		
	        		list.add(cities[i].toUpperCase());
	        		
	        		if(list.size()>cacheSize) {
		        		list.remove(0);
		        	}	
	        	
	        }
	        	        
	        return answer;
	    }
	}
}