import java.util.HashMap;

public class P67256 {
	class Solution {
	    public String solution(int[] numbers, String hand) {
	        String answer = "";
	        
	        String right = "#";
	        String left = "*";
	        
	        HashMap<String, Integer> map = new HashMap<>();
	        map.put("1", 10);
	        map.put("2", 11);
	        map.put("3", 12);
	        map.put("4", 20);
	        map.put("5", 21);
	        map.put("6", 22);
	        map.put("7", 30);
	        map.put("8", 31);
	        map.put("9", 32);
	        map.put("*", 40);
	        map.put("0", 41);
	        map.put("#", 42);
	        
	        
	        for(int i=0; i<numbers.length; i++) {
	        	String now = Integer.toString(numbers[i]);

	        	if(numbers[i]==1||numbers[i]==4||numbers[i]==7) {
	        		answer += "L";
	        		left = now;
	        	} else if(numbers[i]==3||numbers[i]==6||numbers[i]==9) {
	        		answer += "R";
	        		right = now;
	        	} else {			

	        		int a = Math.abs(map.get(left)/10-map.get(now)/10)+Math.abs(map.get(left)%10-map.get(now)%10);
	        		// 왼손 거리
	        		
	        		int b = Math.abs(map.get(right)/10-map.get(now)/10)+Math.abs(map.get(right)%10-map.get(now)%10);
	        		// 오른손 거리

	        		if(a==b) {
	        			if(hand.equals("left")) {
	        				answer += "L";
	    	        		left = now;
	        			} else {
	        				answer += "R";
	    	        		right = now;
	        			}
	        		} else if(a>b) {
	        			answer += "R";
    	        		right = now;
	        		} else {
	        			answer += "L";
    	        		left = now;
	        		}
	        		        		
	        	}
	        }
	        
	        return answer;
	    }
	}
}
