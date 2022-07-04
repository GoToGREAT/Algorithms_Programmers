import java.util.Arrays;
import java.util.LinkedHashMap;

// 문제 이해 부족으로 숫자 자체 고려하지 않음.
public class P42747_1 {
	class Solution {
	    public int solution(int[] citations) {       
	    	int number = citations.length;
	        
	        Arrays.sort(citations);
	        
	        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
	        
	        for(int i=0; i<number; i++) {
	        	if(map.containsKey(citations[i])) {
	        		map.replace(citations[i], map.get(citations[i])+1);
	        	} else map.put(citations[i], 1);
	        }
	        Object[] key = map.keySet().toArray();
	        
	        for(int i=0; i<key.length; i++) {
	        	Integer k = (Integer) key[i];
	        	Integer count = map.get(k);
	        	if(k == number) return k;
	        	number -= count;
	        }
	        return 0;
	    }
	}
}
