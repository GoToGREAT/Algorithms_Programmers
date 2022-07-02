import java.util.ArrayList;
import java.util.List;

public class SC378508_01 {
	public static void main(String[] args) {
		 String dartResult = "1S2D*3T";
	        int answer = 0;
	        
	        char[] darr = dartResult.toCharArray();
	        String[] sscore = {"","",""};	        
	        
	        int[] nscore = new int[3];
	        int[] fscore = new int[3];
	        
	        List<Integer> no = new ArrayList<>();
	        no.add(83);
	        no.add(68);
	        no.add(84);
	        no.add(42);
	        no.add(35);
	        
	        
	        int cnt=0;
	        for(int i=0; i<darr.length; i++) {	        	
	        	if(!no.contains((int)darr[i])) {
	        		sscore[cnt] += darr[i];
	        		if(i!=darr.length-1) {
	        			if(no.contains((int)darr[i+1])) {
	        				cnt++;
	        			}
	        		}
	        	}
	        	System.out.println(cnt);
	        }
	        
	        System.out.println(sscore[0]);
	        System.out.println(sscore[1]);
	        System.out.println(sscore[2]);
	        
	        
	        for(int i=0; i<sscore.length; i++) {
	        	nscore[i] = Integer.parseInt(sscore[i]);
	        }
	        cnt = 0;
	        for(int i=0; i<darr.length;i++) {	        	
	        	if(!no.contains((int)darr[i])) continue;
	        	else {
	        		if(darr[i]==83) {
	        			fscore[cnt]=nscore[cnt];
	        			cnt++;
	        		} else if (darr[i]==68){
	        			fscore[cnt]=nscore[cnt]*nscore[cnt];
	        			cnt++;
	        		} else if (darr[i]==84){
	        			fscore[cnt]=nscore[cnt]*nscore[cnt]*nscore[cnt];
	        			cnt++;
	        		} else if (darr[i]==42) {
	        			fscore[cnt-1] = fscore[cnt-1]*2;
	        			if(cnt-1!=0) {
	        				fscore[cnt-2] = fscore[cnt-2]*2;
	        				}
	        		} else {
	        			fscore[cnt-1] = fscore[cnt-1]*(-1);
	        		}
	        	}
	        }
	       
	        System.out.println(fscore[0]);
	        System.out.println(fscore[1]);
	        System.out.println(fscore[2]);
	        answer += fscore[0]+fscore[1]+fscore[2];
	        
	     
	     System.out.println(answer);
	   

	}

}
