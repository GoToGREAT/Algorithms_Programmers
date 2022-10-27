import java.util.*;

/*채점 결과
정확성: 91.7
합계: 91.7 / 100.0

모든 직선이 동일한 경우 또는 분모가 0인 경우 고려 못해줌
*/
public class P120875_2 {
	class Solution {
	    public int solution(int[][] dots) {
	        List<Double> list = new LinkedList<Double>();
	        
	        for(int i=0; i<dots.length-1; i++) {
	        	for(int q=i+1; q<dots.length; q++) {
	        		int son = dots[i][1]-dots[q][1];
	        		int mother = (dots[i][0]-dots[q][0]);
	        		
	        		int max = son > mother ? son : mother;
	        		
	        		for(int z=mother/2+1; z>1; z--) {
	        			if(son%z == 0 && mother%z == 0) {
	        				son = son/z;
	        				mother = mother/z;
	        				break;
	        			}
	        		}
	        		
	        		Double now = son / (double)mother;	        		
	        		if(list.contains(now)) return 1;
	        		else list.add(now);
	        	}
	        }
	        
	        
	        return 0;
	    }
	}
}