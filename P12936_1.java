import java.util.*;

/*
채점 결과
정확성: 73.7
효율성: 26.3
합계: 100.0 / 100.0
*/
public class P12936_1 {
	class Solution {
	    public int[] solution(int n, long k) {
	    	int[] answer = new int[n];
	    	
	    	List<Integer> list = new ArrayList<>();
	    	for(int q=1; q<=n; q++) {
	    		list.add(q);
	    	}	    	
	    	
	    	long size = 1;
	    	for(int q=2; q<n; q++) {
	    		size *= q;
	    	}
	    	
	    	int end = n-1;
	    	for(int start=0; start<n; start++) {
	    		if(k==0) {
	    			answer[start] = list.get(list.size()-1);
	    			list.remove(list.size()-1);
	    			continue;
	    		} else if(k==1) {
	    			answer[start] = list.get(0);
	    			list.remove(0);
	    			continue;
	    		}	    		
	    		int a = k%size==0 ? (int) (k/size)-1: (int)(k/size);
	    		answer[start] = list.get(a);
	    		k = k%size;
	    		list.remove(a);
	    		if(end != 0) size /= end--;
	    	}	
	    	return answer;
	    }
	}
}
