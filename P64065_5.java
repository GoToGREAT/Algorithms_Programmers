import java.util.*;

public class P64065_5 {	
	// 모든 오류 없앰.
	class Solution {
	    public int[] solution(String s) {
	    	String[] s_arr = s.split("\\}");
	    	int[] answer = new int[s_arr.length];
	    	
	    	HashMap<Integer, Integer> arr_s_l = new HashMap<>();
	    	for(int i=0; i<s_arr.length; i++) {
	    		arr_s_l.put(s_arr[i].length(), i);
	    	}
	    	
	    	 Integer[] get_key = arr_s_l.keySet().toArray(new Integer[0]);
	    	 Arrays.sort(get_key);
	    	 
	    	 HashSet<Integer> set = new HashSet<>();	    	 
	  
	    	 for(int i=0; i<s_arr.length; i++) {
	     		// get_key[i] 가장 작은 길이
	     		// arr_s_l.get(get_key[i]) 가장 작은 길이를 갖은 배열의 순서
	     		// s_arr[arr_s_l.get(get_key[i])] 가장 작은 배열부터 순서대로 부르는 단어
	     		 String a = s_arr[arr_s_l.get(get_key[i])];
	     		 
	     		 String[] a_arr = a.split("");
	     		 String f = "";
	     			    		 
	     		 for(int k=2; k<a_arr.length; k++) {
	     			 if(i==0) {
	     				 f += a_arr[k];
	     			 } else {
	     				 if(!a_arr[k].equals(",")) {
	     					 f += a_arr[k];
	     				 } else {
	     					 int now = set.size();
	     					 set.add(Integer.parseInt(f));
	     					 int after = set.size();
	     					 if(now!=after) {
	     						 answer[i] = Integer.parseInt(f);
	     		    			 //System.out.println(answer[i]);
	     						 break;
	     					 } else f ="";
	     				 }
	     			 }
	     		 }
	    		 
	     		if(i==0 || answer[i]==0) {
	    			 answer[i] = Integer.parseInt(f);
	    			 set.add(Integer.parseInt(f));
	    			 //System.out.println(answer[i]);
	    		 }
	    }   
	    	 return answer;
	}
}
}