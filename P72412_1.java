import java.util.*;

/*
채점 결과
정확성: 40.0
효율성: 0.0
합계: 40.0 / 100.0

쿼리 배열 클론 안하기
스트링 토크나이즈 사용
*/
public class P72412_1 {
	class Solution {
	    public int[] solution(String[] info, String[] query) {
	        int[] answer = new int[query.length];
	       // 0 2 4 6 7
	        
	        for(int i=0; i<query.length; i++) {
	        	StringTokenizer st = new StringTokenizer(query[i]);
	        	String a = st.nextToken();
	        	st.nextToken();
	        	String b = st.nextToken();
	        	st.nextToken();
	        	String c = st.nextToken();
	        	st.nextToken();
	        	String d =st.nextToken();
	        	String e = st.nextToken();
	        	int e1 = Integer.parseInt(e);
	        	
	        	for(int q=0; q<info.length; q++) {
	        		String[] now = info[q].split(" ");
	        		if((a.equals("-") || now[0].equals(a))	&&
	        		   (b.equals("-") || now[1].equals(b))  &&
	        		   (c.equals("-") || 	now[2].equals(c)) &&
	        		   (d.equals("-") ||	now[3].equals(d)) &&
	        		   (e.equals("-") ||
	        		   Integer.parseInt(now[4]) >= e1)) {
	        			answer[i]++;
	        		}
 	        	}
	        }
	        return answer;
	    }
	}
}
