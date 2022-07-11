import java.util.*;

// 정답률 100%
// 그러나 효율성 테스트 통과 못함
public class P12899 {
	class Solution {
	    public String solution(int n) {	    		    	
	    	String answer = "";
			
			if(n<=3) {
	    		if(n==1) return "1";
	    		else if(n==2) return "2";
	    		else if(n==3) return "4";
	    	}
			
			Map<Integer, Integer> map = new HashMap<>();
	    	Map<Integer, Integer> nod = new HashMap<>();
	    	
	    	int numberofdigits = 1;
	    	map.put(numberofdigits, 3);
	    	nod.put(numberofdigits, 3);
	    	
	    	for(int i=2; i<100; i++) {
	    		numberofdigits++;
	    		
	    		int a = map.get(i-1)*3;
	    		map.put(numberofdigits, a);
	    		
	    		int b = nod.get(i-1)+a;
	    		nod.put(numberofdigits, b);
	    		
	    		if(b>n) break;
	    	}
	    	
	    	n-= nod.get(numberofdigits-1);
	    	
	    	int[] possible = {1,2,4};
    		
    		for(int i = numberofdigits; i>1; i--) {
    			if(n==0) answer += possible[2];
    			else {
    				int a = n;
    				int b = map.get(i-1);
    				int c = a%b==0 ? a/b-1 : a/b;
    				answer += possible[c];
    				n -= a/b * b;    				
    			}
    		}
	    	
	    	if(n==0 || n==3) answer += "4";
			else if(n==1) answer += "1";
			else if(n==2) answer += "2";    	
	    	return answer;
	    }
	}
}