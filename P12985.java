
/*
채점 결과
정확성: 55.9
합계: 55.9 / 100.0
 */
public class P12985 {
	class Solution
	{
	    public int solution(int n, int a, int b)
	    {   int answer = 1;
	    	
	    
	    	int p1 = a;
	    	int p2 = b;
	    	while(true) {
	    		p1 = (p1-1)/2;
	    		p2 = (p2-1)/2;
	    		
	    		if(p1==p2) return answer;
	    		else {
	    			answer++;
	    		}	    		
	    	}
	    }
	}
}
