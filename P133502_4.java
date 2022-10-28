import java.util.*;
import java.util.stream.*;

/*
채점 결과
정확성: 35.3
합계: 35.3 / 100.0

for문으로 리스트 변환은 문제였던듯
 */

public class P133502_4 {
	class Solution {
	    public int solution(int[] ingredient) {
	        int answer = 0;
	        
	        List<Integer> list = new LinkedList<>();
	        
	        for(int i=0; i<ingredient.length; i++) {
	        	if(i<ingredient.length-3 && ingredient[i]==1
	        			&& ingredient[i+1]==2 && ingredient[i+2]==3 && ingredient[i+3]==1) {
	        		answer++;
	        		i = i+3;
	        	} else {
	        		list.add(ingredient[i]);	        		
	        	}
	        }
	       
	        
	        int start = 0;
	        
	        while(true) {	        	
	        	if(start == list.size()-3) break;
	        	
	        	if(list.get(start)==1 && list.get(start+1)==2
	        			&& list.get(start+2)==3 && list.get(start+3)==1) {
	        		answer++;
	        		list.remove(start+3);
	        		list.remove(start+2);
	        		list.remove(start+1);	        		
	        		list.remove(start);
	        		
	        		if(list.size()<4) break;
	        		
	        		start=0;
	        	} else {
	        		start++;
	        	}
	        }
	        
	        return answer;
	    }
	}
}