import java.util.*;

public class P12899_Test1 {
	public static void main(String[] args) {				
		int n = 60;
		
		String answer = "";
		
		Map<Integer, Integer> map = new HashMap<>();
    	Map<Integer, Integer> nod = new HashMap<>();
    	
    	int numberofdigits = 0;
    	map.put(numberofdigits, 1);
    	nod.put(numberofdigits, 0);
    	numberofdigits++;
    	
    	for(int i=1; i<100; i++) {    		
    		int a = map.get(i-1)*3;
    		map.put(numberofdigits, a);
    		
    		int b = nod.get(i-1)+a;
    		nod.put(numberofdigits, b);
    		
    		if(b>=n) break;
    		numberofdigits++;
    	}  	
    	
    	n-= nod.get(numberofdigits-1);
    	
		for(int i = numberofdigits; i>0; i--) {
			int a = map.get(i-1);
			if(n==0) {
				answer += "4";
			} else if(n <= a) {
				answer += "1";
				if(n==a) n-=a;
			} else if(n<= a*2) {
				answer += "2";
				n-= a;
				if(n==a*2) n-=a;
			} else {
				answer += "4";
				n-= 2*a;
				if(n==a*3) n-=a;
			}    			
		}    	  	
    	System.out.println(answer);
    		
    	}
	}	