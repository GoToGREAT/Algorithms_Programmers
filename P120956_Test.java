public class P120956_Test {
	public static void main(String[] args) {
	        int answer = 0;
	        
	        String[] can = {"aya", "ye", "woo", "ma"};
	        
	        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
	        
	        for(int i=0; i<babbling.length; i++) {
	        	String word = babbling[i];
	        	int now = 0;
	        	while(true) {
	        		int a = word.indexOf(can[now]);
	        		int b = word.replaceFirst(can[now], "").indexOf(can[now]);
	        		System.out.println(word + " " + a + " " + b);
	        		if(a-b == 0 && a != -1) break;
	        		
	        		word = word.replaceAll(can[now], "");
	        		if(word.isBlank()) {
	        			answer++;
	        			System.out.println(babbling[i]);
	        			break;
	        		}
	        		now++;
	        		if(now>=4) break;
	        	}
	        }
	        
	     System.out.println(answer);
	  
	}
}