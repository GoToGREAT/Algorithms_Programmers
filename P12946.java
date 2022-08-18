import java.util.*;
// 문제는 정답이지만
// 테스트 케이스는 오류임. - 테스트케이스와 정답은 같지만 한개가 틀림.
public class P12946 {
	class Solution {
	    public int[][] solution(int n) {
	    	List<Integer[]> answer_list = new ArrayList<>();
	    	hanoi(answer_list, n, 1,3,2);
	        int[][] answer = new int[answer_list.size()][2];
	        for(int i=0; i<answer.length; i++) {
	        	Integer[] now = answer_list.get(i);
	        	answer[i][0] = now[0];
	        	answer[i][1] = now[1];
	        }
	        return answer;
	    }
	    
	    void hanoi(List<Integer[]> answer_list, int n, int start, int to, int via){	    	
	    	if(n==1) {
	    		move(answer_list, 1, start, to);
	    	} else {
	    		hanoi(answer_list, n-1, start, via, to);
	    		move(answer_list, n, start, to);
	    		hanoi(answer_list, n-1, via, to, start);
	    	}
 	    }
	    
	   void move(List<Integer[]> answer_list, int n, int start, int to) {
	    	Integer[] answer = {start, to};
	    	answer_list.add(answer);
	    }
 	    
	}
}