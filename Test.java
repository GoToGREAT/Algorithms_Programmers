		
public class Test {
	public static void main(String[] args) {
		String s = "try hello world";
        String[] splits = s.split("");
        String answer = "";
        int cnt = 0;
        for(int i=0; i<splits.length; i++){
            if(cnt%2==0){
                answer += splits[i].toUpperCase();
            } else answer += splits[i];
            if(splits[i].equals(" ")) cnt=0;
            else cnt++;
            System.out.println(i+"번째 : "+cnt+" : "+answer);
        } 
        System.out.println(answer);
	        
	    }   
	}

