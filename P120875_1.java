import java.util.*;

/*채점 결과
정확성: 91.7
합계: 91.7 / 100.0
*/
public class P120875_1 {
	class Solution {
	    public int solution(int[][] dots) {	        
	        List<String> list = new LinkedList<String>();
	        
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
	        		
	        		String now = Integer.toString(son)+"/"+Integer.toString(mother);
	        		
	        		if(list.contains(now)) return 1;
	        		else list.add(now);
	        	}
	        }
	        
	        
	        return 0;
	    }
	}
}