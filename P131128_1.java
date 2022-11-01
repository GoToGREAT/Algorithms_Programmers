/*
replaceAll로도 시간 초과를 수습하지 못함

테스트 11 〉	실패 (시간 초과)
테스트 12 〉	실패 (시간 초과)
테스트 13 〉	실패 (시간 초과)
테스트 14 〉	실패 (시간 초과)
테스트 15 〉	실패 (시간 초과)
 */



public class P131128_1 {
	class Solution {
	    public String solution(String X, String Y) {
	        String answer = "";	        
	        
	        for(int i=9; i>=0; i--) {
	        	String check = Integer.toString(i);
	        	
	        	if(X.contains(check) && Y.contains(check)) {
	        		
	        			int a = X.length()-X.replaceAll(check, "").length();
	        			int b = Y.length()-Y.replaceAll(check, "").length();
	        			
	        			int max = a>b ? b : a;
	        			
	        			for(int q=0; q<max; q++) {
	        				answer += check;
	        			}
	        			
	        			X = X.replaceAll(check, "");
	        			Y = Y.replaceAll(check, "");	        			
	        			        		
	        	}
	        }	              
	        
	        if(answer.isBlank() || answer.isEmpty()) return "-1";
	        if(answer.replaceAll("0", "").length()==0) return "0";	        
	        return answer;
	    }
	}
}