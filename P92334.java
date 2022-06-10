import java.util.Arrays;

public class P92334 {
	class Solution {
	    public int[] solution(String[] id_list, String[] report, int k) {
	    	// 중복제거
	    	String[] resultArr = Arrays.stream(report).distinct().toArray(String[]::new);
    	
	    	int[] reportcount = new int[id_list.length];	
	    	int[] answer = new int[id_list.length];
	    	String[] user_a = new String[resultArr.length];
	        String[] user_b = new String[resultArr.length];
	        
	        for(int i=0; i<resultArr.length; i++) {
	        	String[] ab = resultArr[i].split(" ");
	        	user_a[i] = ab[0]; // 신고자
	        	user_b[i] = ab[1]; // 신고당한 자
	        	
	        	for(int t=0; t<id_list.length; t++) {
	        		if(user_b[i].equals(id_list[t])) {
	        			reportcount[t]++;
	        		}
	        	}
	        }
	        
	       
	        
	        for(int q=0; q<id_list.length; q++) {
	        	if(reportcount[q]>=k) { // 신고자 확정
	        		for(int e=0; e<resultArr.length; e++) {
	        			if(user_b[e].equals(id_list[q])) {// 신고당한 순서 찾기
	        				for(int t=0; t<id_list.length; t++) {//신고자 찾아서 횟수 올리기
	        					if(user_a[e].equals(id_list[t])) {
	        						answer[t]++;
	        					}
	        				}
	        			}	        			
	        		}
	        	}
	        } 
	        
	        return answer;
	    }
	}
}
