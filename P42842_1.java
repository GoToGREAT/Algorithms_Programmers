
/*
채점 결과
정확성: 76.9
합계: 76.9 / 100.0
 */
public class P42842_1 {
	class Solution {
    public int[] solution(int brown, int yellow) {
    	int total = brown+yellow;
    	double total_sqrt = Math.sqrt(total);
    	
    	int l1 = (int)Math.floor(total_sqrt);
    	int l2 = 0;
    	
    	while(true) {
    		if(total%l1 == 0) {
    			l1 = (total/l1) >= l1 ? (total/l1) : l1;
    			l2 = (total/l1) >= l1 ? l1 : (total/l1);
    			int[] answer = {l1, l2};
    	        return answer;
    		} else l1++;
    	}
    	
     }
	}
 }
