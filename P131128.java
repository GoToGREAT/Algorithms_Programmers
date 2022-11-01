/*
테스트 6 〉	실패 (런타임 에러)
테스트 7 〉	실패 (런타임 에러)
테스트 8 〉	실패 (런타임 에러)
테스트 9 〉	실패 (런타임 에러)
테스트 10 〉	실패 (런타임 에러)
테스트 11 〉	실패 (시간 초과)
테스트 12 〉	실패 (시간 초과)
테스트 13 〉	실패 (시간 초과)
테스트 14 〉	실패 (시간 초과)
테스트 15 〉	실패 (시간 초과)
채점 결과
정확성: 47.4
합계: 47.4 / 100.0
 */



public class P131128 {
	class Solution {
	    public String solution(String X, String Y) {
	        String answer = "";	        
	        
	        for(int i=9; i>=0; i--) {
	        	String check = Integer.toString(i);
	        	
	        	if(X.contains(check) && Y.contains(check)) {
	        		while(X.contains(check) && Y.contains(check)) {
	        			X = X.replaceFirst(check, "");
	        			Y = Y.replaceFirst(check, "");
	        			answer += check;
	        		}	        		
	        	}
	        }	              
	        
	        if(answer.isBlank() || answer.isEmpty()) return "-1";
	        
	        //런타임 에러 이유
	        if(Integer.parseInt(answer)==0) return "0";
	        
	        return answer;
	    }
	}
}