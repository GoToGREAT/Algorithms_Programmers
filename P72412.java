/*
채점 결과
정확성: 40.0
효율성: 0.0
합계: 40.0 / 100.0

조건에 사람 맞추기
*/
public class P72412 {
	class Solution {
	    public int[] solution(String[] info, String[] query) {
	        int[] answer = new int[query.length];
	       // 0 2 4 6 7
	        for(int i=0; i<query.length; i++) {
	        	String[] condition = query[i].split(" ");
	        	String[] now_info = info.clone();
	        	for(int q=0; q<now_info.length; q++) {
	        		String[] now = now_info[q].split(" ");
	        		if((condition[0].equals("-") || now[0].equals(condition[0]))	&&
	        		   (condition[2].equals("-") || now[1].equals(condition[2]))  &&
	        		   (condition[4].equals("-") || 	now[2].equals(condition[4])) &&
	        		   (condition[6].equals("-") ||	now[3].equals(condition[6])) &&
	        		   (condition[7].equals("-") ||
	        		   Integer.parseInt(now[4]) >= Integer.parseInt(condition[7]))) {
	        			answer[i]++;
	        		}
 	        	}
	        }
	        return answer;
	    }
	}
}
