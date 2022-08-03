import java.util.*;


public class P12981_Test {
	public static void main(String[] args) {
		int n=2;
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
	    List<String> list = new ArrayList<>();
	    list.add(words[0]);
	     for(int i=0; i<words.length-1; i++) {
	    	 if(list.contains(words[i+1]) ||
	    		words[i].charAt(words[i].length()-1) != words[i+1].charAt(0) ) {
	    		 int cut = i+2;
	    		 System.out.println(cut);
	    		 int a = 1;
	    		 int b = 0;
	    		 while(true) {
	    			 if(cut <= (a*n)) {
	    				 System.out.println("a : "+a);
	    				 b = cut-(a-1)*n;
	    				 System.out.println("b = cut-(a-1)*n / "+b +"=  "+(cut-(a-1)*n));
	    				 break;
	    			 } else a++;
	    		 }
	    		 int[] answer = {a,b};
	    		 System.out.println("끝 : "+answer[0]+" /"+answer[1]);
	    	 }
	    	 list.add(words[i+1]);
	     }
	     int[] answer = {0,0};
	     System.out.println(answer[0]);
	     System.out.println(answer[1]);

	}
}