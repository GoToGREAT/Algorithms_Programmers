import java.util.*;

/*채점 결과
정확성: 91.7
합계: 91.7 / 100.0
*/
public class P120875 {
	class Solution {
	    public int solution(int[][] dots) {	        
	        List<Double> list = new LinkedList<Double>();
	        
	        for(int i=0; i<dots.length-1; i++) {
	        	for(int q=i+1; q<dots.length; q++) {
	        		double now = (double)(dots[i][1]-dots[q][1])/(double)(dots[i][0]-dots[q][0]);
	        		if(list.contains(now)) return 1;
	        		else list.add(now);
	        	}
	        }
	        
	        
	        return 0;
	    }
	}
}