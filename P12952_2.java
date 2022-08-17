import java.util.*;

/*
 채점 결과
정확성: 18.2
합계: 18.2 / 100.0
 */
public class P12952_2 {
	class Solution {
	    public int solution(int n) {
	    	List<String> possible = new ArrayList<>();
	    	List<String> answer = new ArrayList<>();
	    	for(int i=1; i<n+1; i++) {
	    		possible.add(Integer.toString(i));
	    		answer.add(Integer.toString(i));
	    	}
	    	int cnt = 1;
	    	while(true) {
	    		cnt++;
	    		List<String> now_check = answer;
	    		answer = new ArrayList<>();	    		
	    	
	    		for(int i=0; i<now_check.size(); i++) {
	    			List<String> now_possible = new ArrayList<>();
	    			now_possible.addAll(possible);
	    			
	    			String now = now_check.get(i);
	    			int a = now.charAt(now.length()-1)-48;
	    			
	    			for(int q=n-1; q>=0; q--) {
	    				if(now.contains(now_possible.get(q)) || Math.abs(a-Integer.parseInt(now_possible.get(q)))<=1){
	    					now_possible.remove(q);
	    				}
	    			}
	    			
	    			for(int q=0; q<now_possible.size(); q++) {
	    				answer.add(now+now_possible.get(q));
	    			}
	    		}
	    		if(cnt==n) break;
	    	}
	    	
	        return answer.size();
	    }
	}
}