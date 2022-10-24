import java.util.*;

public class P120868_Test {
	public static void main(String[] args) {
		   int[] sides = {1,2};
	        int answer = 0;
	        
	        Arrays.sort(sides);
	        
	        for(int i=1; i<=sides[1]; i++) {
	        	if(i+sides[0] > sides[1]) {
	        		answer++;
	        		System.out.println(i);
	        	}
	        }
	        
	        int can = sides[1]+1;
	        int sum = sides[0]+sides[1];
	        while(true) {
	        	if(sum > can) {
	        		answer++;
	        		System.out.println(can);
	        	}
	        	else break;
	        	can++;
	        }
	        
	   System.out.println("끝났습니다 : "+answer);
	}
}