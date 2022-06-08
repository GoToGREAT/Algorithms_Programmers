import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P42889 {
	class Solution {
	    public int[] solution(int N, int[] stages) {
	    	List<Integer> purestage = new ArrayList<>(); // 스테이지 수 중복 삭제
	    	for(int i=0; i<stages.length; i++) {
	    		if(purestage.contains(stages[i]) != true) {
	    			purestage.add(stages[i]);
	    		}
	    	}
	    	List<Integer> percent_stage = new ArrayList<>(); // 스테이지 실패 구하기
	    	for(int k=0; k<purestage.size(); k++) {
	    		int a = 0; // 분모
	    		int b = 0; // 분자
	    		for(int i=0; i<stages.length; i++) {
	    			if(purestage.get(k) >= stages[i]) {
	    				a++;
	    				if(purestage.get(k) > stages[i]) {
	    					b++;
	    				}
	    			}
	    			percent_stage.add((a-b)/a);
	    		}
	    	}	    	
	    	List<Integer> sort_percent = percent_stage;
	    	Collections.sort(sort_percent, Collections.reverseOrder());
	    	// 내림차순 정렬
	    	
	    	int[] answer = new int[sort_percent.size()];
	    	for(int i=0; i<percent_stage.size(); i++) {
	    		answer[i] = purestage.get(percent_stage.indexOf(sort_percent.get(i)));
	    	}	        
	        return answer;
	    }
	}
}
