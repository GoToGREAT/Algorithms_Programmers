public class P12951 {
	// 8번 케이스 제외 모두 성공
	class Solution {
	    public String solution(String s) {
	    	String[] arr = s.split(" ");
	    	String answer = "";
	    	
	    	for(int i=0; i<arr.length; i++) {	    		
	    		String[] a = arr[i].trim().split("");	    		
	    		
	    	
	    		for(int q=0; q<a.length; q++) {
	        		if(q==0) {
	        			answer += a[q].toUpperCase();
	        		} else {
	        			answer += a[q].toLowerCase();
	        		}
	        	}
	    		if(i != arr.length-1) answer += " ";	    	
	    		   		
	    	}
	        return answer.trim();
	    }
	}
}