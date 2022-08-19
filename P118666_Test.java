import java.util.*;

public class P118666_Test {
	public static void main(String[] args) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
	    	HashMap<String, Integer> map = new HashMap<>();
	    	String[] input = {"R", "T", "C", "F", "J", "M", "A", "N"};
	    	for(int i=0; i<8; i++) {
	    		map.put(input[i], 0);
	    	}
	    	
	    	for(int i=0; i<survey.length; i++) {
	    		if(choices[i]<4) {
	    			String now = survey[i].substring(0, 1);
	    			int before = map.get(now);
	    			map.replace(now, before+Math.abs(choices[i]-4));
	    		} else if(choices[i]>4) {
	    			String now = survey[i].substring(1, 2);
	    			int before = map.get(now);
	    			map.replace(now, before+Math.abs(choices[i]-4));
	    		}
	    	}
	    	
	        String answer = "";
	        
	        for(int i=0; i<4; i++) {
	        	System.out.println(input[i*2]+" : "+map.get(input[i*2]));
	        	System.out.println(input[i*2+1]+" : "+map.get(input[i*2+1]));
	        	if(map.get(input[i*2])>=map.get(input[i*2+1])) {
	        		answer += input[i*2];
	        	} else {
	        		answer += input[i*2+1];
	        	}
	        }
	       
	}
}
