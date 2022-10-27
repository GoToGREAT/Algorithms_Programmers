import java.util.*;
import java.util.stream.*;

/*

 */

public class P133502_3_Test {
	public static void main(String[] args) {
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		
		int answer = 0;
        
        int size = ingredient.length%10 == 0 ? ingredient.length/10 : ingredient.length/10+1;
        
        String[] str = new String[size+1];
        
        for(int i=0; i<size; i++) {
        	str[i] = "";
        	answer += InputCheck(i, size, str, ingredient);
        	System.out.println("str[i] : "+str[i]);
        }
        
        String ingre = "";
        for(int i=0; i<size; i++) {
        	ingre += str[i];
        }
        
        System.out.println("ingre : "+ingre);
        
        while(true) {
        	if(ingre.length() == ingre.replaceAll("1231", "").length()) break;
        	else {
        		answer += (ingre.length()-ingre.replaceAll("1231", "").length())/4;	        		
        		ingre = ingre.replaceAll("1231", "");
        	}
        }
        
        System.out.println("끝났습니다 : "+answer);
	}
	
	static int InputCheck(int start, int size, String[] str, int[] ingredient) {
	    	int answer = 0;
	    	
	    	if(start == size-1) {
	    		for(int i=start*100000; i<ingredient.length; i++) {
	 	        	str[start] += Integer.toString(ingredient[i]);
	 	        }	 	        
	 	        
	    	} else {
	    		for(int i=start*100000; i<start*100000; i++) {
	 	        	str[start] += Integer.toString(ingredient[i]);
	 	        }      
	    	}
	    	
	    	while(true) {
 	        	if(str[start].length() == str[start].replaceAll("1231", "").length()) break;
 	        	else {
 	        		answer += (str[start].length()-str[start].replaceAll("1231", "").length())/4;	        		
 	        		str[start] = str[start].replaceAll("1231", "");
 	        	}
 	        } 	
	    	
	    	return answer;
	    }
}