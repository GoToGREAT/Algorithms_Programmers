// 단순 나누기로 구할 수 없음
public class P42842 {
	class Solution {
	    public int[] solution(int brown, int yellow) {
	    	int total = brown+yellow;
	    	
	    	int l1 = 2;
	    	int l2 = 1;
	    	
	    	while(true) {
	    		if(total%l1==0) {
	    			l2 = (total/l1) >= l1 ? l1 : (total/l1);
	    			l1 = (total/l1) >= l1 ? (total/l1) : l1;
	    			int[] answer = {l1, l2};
	    	        return answer;
	    		} else {
	    			l1 ++;
	    		}
	    	}
	     }
		}
 }
