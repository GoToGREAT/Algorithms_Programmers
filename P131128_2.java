/*
stringbuilder는 소중했다.
 */



public class P131128_2 {
	class Solution {
	    public String solution(String X, String Y) {
	        StringBuilder build = new StringBuilder();   
	        
	        for(int i=9; i>=0; i--) {
	        	String check = Integer.toString(i);
	        	
	        	if(X.contains(check) && Y.contains(check)) {
	        		
	        			int a = X.length()-X.replaceAll(check, "").length();
	        			int b = Y.length()-Y.replaceAll(check, "").length();
	        			
	        			int max = a>b ? b : a;
	        			
	        			for(int q=0; q<max; q++) {
	        				build.append(check);
	        			}
	        			
	        			X = X.replaceAll(check, "");
	        			Y = Y.replaceAll(check, "");	        			
	        			        		
	        	}
	        }	              
	        
	        String answer = build.toString(); 
	        if(answer.isBlank() || answer.isEmpty()) return "-1";
	        if(answer.replaceAll("0", "").length()==0) return "0";	        
	        return answer;
	    }
	}
}