import java.util.*;

/*

 */

public class P135808 {
	class Solution {
	    public int solution(int k, int m, int[] score) {
	        int answer = 0;        
	      
	        Arrays.sort(score);
	        
	        int now = score.length-1;
	        
	        while(now > 0) {
	        	if(now-m+1 < 0) break;
	        	else answer += score[now-m+1]*m;
	        	now = now-m;
	        }
	        
	        return answer;
	    }
	}
}