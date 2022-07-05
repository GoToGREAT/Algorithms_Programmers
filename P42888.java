import java.util.*;

public class P42888 {
	class Solution {
	    public String[] solution(String[] record) {
	    	HashMap<String, String> name = new HashMap<>();
	    	
	    	int cnt = record.length;
	    	
	    	for(int i=0; i<record.length; i++) {
	    		String line = record[i];
	    		String[] arr = line.split(" ");
	    		if(arr[0].equals("Change")) cnt--;
	    		if(arr[0].equals("Enter")||arr[0].equals("Change")) {
	    			name.put(arr[1], arr[2]);
	    		}    		
	    	}
	    	
	    	String[] answer = new String[cnt];
	    	int q = 0;
	    	
	    	for(int i=0; i<record.length; i++) {
	    		String line = record[i];
	    		String[] arr = line.split(" ");
	    		if(arr[0].equals("Enter")) {
	    			answer[q++] = name.get(arr[1])+"님이 들어왔습니다.";
	    		} else if(arr[0].equals("Leave")) {
	    			answer[q++] = name.get(arr[1])+"님이 나갔습니다.";
	    		}   		
	    	}
	    	
	        return answer;
	    }
	}
}