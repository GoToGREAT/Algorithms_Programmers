import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P12915 {
	class Solution {
	    public String[] solution(String[] strings, int n) {
	        Map<String, String> map = new HashMap<>();
	        for(int i=0; i<strings.length; i++) {
	        	String[] a = strings[i].split("");
	        	map.put(strings[i], a[i]);
	        }
	        Object[] sortvalue = map.keySet().toArray();
	        Arrays.sort(sortvalue);
	        
	        String[] answer = new String[sortvalue.length];	        
	        for(int i=0; i<sortvalue.length; i++) {
	        	//
	        }
	        return answer;
	    }
	}
}
