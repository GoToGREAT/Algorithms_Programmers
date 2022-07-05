public class P12951_1 {
	// 처음과 끝 공백 확인
	class Solution {		
	    public String solution(String s) {
	    	boolean aempty = false;
	    	boolean bempty = false;
	    	
	    	if(!s.equals(s.trim())) {
	    		String[] s_Arr = s.split("");
	    		if(s_Arr[0].isEmpty()|| s_Arr[0].equals(" ")) aempty=true;
	    		if(s_Arr[s_Arr.length-1].isEmpty()|| s_Arr[s_Arr.length-1].equals(" ")) bempty = true;
	    	}
	    	
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
	    	
	    	if(aempty) answer = " "+answer;
	    	if(bempty) answer = answer+" ";
	        return answer;
	    }
	}
}