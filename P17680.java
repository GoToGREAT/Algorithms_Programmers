import java.util.*;

/*
 문제 이해를 잘 못함.
 캐시 관련 알고리즘을 알고 있었어야 함.
 */


public class P17680 {
	class Solution {
	    public int solution(int cacheSize, String[] cities) {
	        int answer = 5;
	        
	        for(int i=1; i<cities.length; i++) {
	        	if(cities[i].equals(cities[i-1])) {
	        		answer +=1;
	        	} else answer +=5;
	        }
	        	        
	        return answer;
	    }
	}
}