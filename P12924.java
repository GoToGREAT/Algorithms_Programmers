import java.util.*;

public class P12924 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        int start = 0;
	        int end = 0;
	        int sum = 0;
	        
	        while(true) {
	        	if(sum<n) {
	        		start++;
	        		sum += start;
	        	} else if(sum == n) {
	        		answer ++;
	        		start++;
	        		sum += start;
	        	} else if(sum>n) {
	        		end++;
	        		sum-=end;
	        	}
	        	if(start > n) break;
	        }	
	        return answer;
	    }
	}
}