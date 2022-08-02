import java.util.Arrays;

public class P42860_Test {
	public static void main(String[] args) {
		     String name="JAN";
		
		     int A = 65;
		    	int Z = 90;
		    	
		    	int answer = 0;
		    	
		    	
		    	for(int i=0; i<name.length(); i++) {
		    		int current = name.charAt(i);		    		
		    		int[] test = new int[2];
		    		test[0] = Math.abs(A-current);
		    		test[1] = Math.abs(Z-current)+1;
		    		System.out.println(current+" / "+test[0]+" / "+test[1]);
		    		Arrays.sort(test);
		    		answer+=test[0];
		    		
		    		System.out.println(i+"번 째에 움직인 숫자는 : "+answer);
		    	}
		    	answer += name.length()-1;
	       System.out.println(answer);
	    }
	}