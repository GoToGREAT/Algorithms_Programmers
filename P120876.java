import java.util.*;

/*채점 결과
정확성: 91.7
합계: 91.7 / 100.0
*/
public class P120876 {
	class Solution {
	    public int solution(int[][] lines) {
	        int answer = 0;
	        
	        HashMap<Integer, Integer> map = new HashMap<>();
	        
	        int[] one = lines[0];
	        int[] two = lines[1];
	        int[] three = lines[2];
	        
	        for(int i=one[0]; i<one[1]; i++) {
	        	map.put(i, 0);
	        }
	        
	        for(int i=two[0]; i<two[1]; i++) {
	        	if(map.containsKey(i)) {
	        		map.replace(i, map.get(i)+1);
	        	} else map.put(i, 0);
	        }
	        
	        for(int i=three[0]; i<three[1]; i++) {
	        	if(map.containsKey(i)) {
	        		map.replace(i, map.get(i)+1);
	        	} else map.put(i, 0);
	        }
	        
	        Object[] value = map.values().toArray();
	        
	        for(int i=0; i<value.length; i++) {
	        	if((int)value[i]!=0) answer++;
	        }
	        
	        return answer;
	    }
	}
}