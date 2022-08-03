import java.util.*;


public class P12981 {
	class Solution {
	    public int[] solution(int n, String[] words) {
	    
	    List<String> list = new ArrayList<>();
	    list.add(words[0]);
	     for(int i=0; i<words.length-1; i++) {
	    	 if(list.contains(words[i+1]) ||
	    		words[i].charAt(words[i].length()-1) != words[i+1].charAt(0) ) {
	    		 int cut = i+2;
	    		 int a = 1;
	    		 int b = 0;
	    		 while(true) {
	    			 if(cut <= (a*n)) {
	    				 b = cut-(a-1)*n;
	    				 break;
	    			 } else a++;
	    		 }
	    		 int[] answer = {b,a};
	    		 return answer;
	    	 }
	    	 list.add(words[i+1]);
	     }
	     int[] answer = {0,0};
	     return answer;
	    }
	}
}