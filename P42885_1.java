import java.util.*;

/*
채점 결과
정확성: 75.0
효율성: 25.0
합계: 100.0 / 100.0
 */
public class P42885_1{
	class Solution {
	    public int solution(int[] people, int limit) {
	        int answer = 0;
	        Arrays.sort(people);
	        
	        int start = 0;
	        
	        for(int i=people.length-1; i>-1; i--) {
	        	if(i<start) break;
	        	else if(start<i && people[start]+people[i]<=limit) {
	        		answer++;
	        		start++;
	        	} else {
	        		answer++;
	        	}
	        	
	        }
	        return answer;
	    }
	}
}
