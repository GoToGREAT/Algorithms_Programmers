import java.util.*;
import java.util.stream.*;


/*
채점 결과
정확성: 20.0
효율성: 10.0
합계: 30.0 / 100.0

모두 런타임에러 발생
 */
public class P42885{
	class Solution {
	    public int solution(int[] people, int limit) {
	        int answer = 0;
	        Arrays.sort(people);
	        
	        List<Integer> list = Arrays.stream(people).boxed().collect(Collectors.toList());
	        
	        int start = list.size()-1;
	        
	        while(true) {
	        	if(list.get(start)>limit-40) {
	        		answer++;
	        		list.remove(start--);
	        	} else if(list.size()==1 || list.get(start)+list.get(0)>limit) {
	        		answer++;
	        		list.remove(start--);
	        	} else {
	        		int a=1;
	        		while(true) {
	        			if(a>=start) break;
	        			if(list.get(start)+list.get(a)>limit) break;
	        			else a++;
	        		}
	        		a--;
	        		answer++;
	        		list.remove(start);
	        		list.remove(a);
	        	}
	        	if(list.size()==0) break;
	        }
	        return answer;
	    }
	}
}
