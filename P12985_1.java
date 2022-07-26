
/*
음수 가능성 생각하기
 */
public class P12985_1 {
	class Solution
	{
	    public int solution(int n, int a, int b)
	    {   int answer = 1;
	    	int p1 = a;
	    	int p2 = b;
	    	while(true) {
	    		p1 = (p1+1)/2;
	    		p2 = (p2+1)/2;
	    		
	    		if(p1==p2) return answer;
	    		else {
	    			answer++;
	    		}	    		
	    	}
	    }
	}
}
