import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P12906_1 {
	public class Solution {
	    public int[] solution(int []arr) {
	      List<Integer> answerlist = Arrays.stream(arr).boxed().collect(Collectors.toList()); 
		    	for(int i=answerlist.size()-1; i>0;i--) {
		    		if(answerlist.get(i)==answerlist.get(i-1)) {
		    			answerlist.remove(i);
		    		}
		    	}
		    	int[] answer = answerlist.stream().mapToInt(Integer::intValue).toArray();
		        return answer;
	    }
	}
}
