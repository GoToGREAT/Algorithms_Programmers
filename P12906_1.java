import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P12906_1 {
	public class Solution {
	    public int[] solution(int []arr) {
	      List<Integer> answerlist = new ArrayList<>();
	      answerlist.add(arr[0]);
		    	for(int i=1; i<arr.length;i++) {
		    		if(arr[i]!=arr[i-1]) {
		    			answerlist.add(arr[i]);
		    		}
		    	}
		    	int[] answer = answerlist.stream().mapToInt(Integer::intValue).toArray();
		        return answer;
	    }
	}
}
