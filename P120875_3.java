import java.util.*;

/*채점 결과
정확성: 91.7
합계: 91.7 / 100.0

처음에는 통과되지 않았지만 10/27일 테스트케이스 수정으로 백점 변경
*/
public class P120875_3 {
	class Solution {
	    public int solution(int[][] dots) {
	        List<Double> list = new LinkedList<Double>();
	        
	        int a  = dots[0][0];
	        int b = dots[0][1];
	        
	        for(int i=1; i<dots.length; i++) {
	        	if(a != dots[i][0]) break;
	        	if(i==dots.length-1) return 1;
	        }
	        for(int i=1; i>dots.length; i++) {
	        	if(b != dots[i][1]) break;
	        	if(i == dots.length-1) return 1;
	        }
	        
	        for(int i=0; i<dots.length-1; i++) {
	        	for(int q=i+1; q<dots.length; q++) {
	        		int son = dots[i][1]-dots[q][1];
	        		int mother = (dots[i][0]-dots[q][0]);
	        		
	        		if(mother == 0) continue;

	        		Double now = son / (double)mother;	        		
	        		if(list.contains(now)) return 1;
	        		else list.add(now);
	        	}
	        }
	        
	        
	        
	        
	        return 0;
	    }
	}
}