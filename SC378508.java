
public class SC378508 {
	public static void main(String[] args) {
		 String dartResult = "1S2D*3T";
	     int answer = 0;
	     char[] arr = dartResult.toCharArray();
	     String[] score = new String[3];
	     score[0]="";
	     score[1]="";
	     score[2]="";
	     int[] nscore = new int[3];
	     int[] fscore = new int[3];
	    		
	     for(int i=0; i<arr.length; i++) {
	    	 int cnt=0;
	    	 if((arr[i]==83 || arr[i]==68 || arr[i]==84 || arr[i]==35 || arr[i]==42) == false) {
    			 score[cnt]+=arr[i];
    			 if(i!=arr.length-1) {
    				 if((arr[i+1]==83 || arr[i+1]==68 || arr[i+1]==84 || arr[i+1]==35 || arr[i+1]==42)== false) {
    	    			 score[cnt]+=arr[i+1];
    	    	    	 }
    			 } 
    			 nscore[cnt] = Integer.parseInt(score[cnt]);
    			 cnt++;
    		 }
	    	 
	    	 int a = 0;
	    	 
	    	 if(arr[i]==83 || arr[i]==68 || arr[i]==84 || arr[i]==35 || arr[i]==42) {
		    	 if(arr[i]==83) {
		    		 fscore[cnt-1] = nscore[cnt-1];
		    	 } else if(arr[i]==68) {
		    		 fscore[cnt-1] = nscore[cnt-1]*nscore[cnt-1];
		    	 } else if(arr[i]==84) {
		    		 fscore[cnt-1] = nscore[cnt-1]*nscore[cnt-1]*nscore[cnt-1];
		    	 } else if(arr[i]==35) {
		    		 fscore[cnt-1] = fscore[cnt-1]*(-1); 
		    	 } else if(arr[i]==42) {
		    		 fscore[cnt-1] = fscore[cnt-1]*(2);
		    		 if(cnt-2>-1) {
		    			 fscore[cnt-2] = fscore[cnt-2]*(2); 
		    		 }
		    	 }
	    	 }
	     }  
	     
	     for(int i=0; i<3; i++) {
	    	 answer += fscore[i];
	     }
	     
	     System.out.println(answer);
	   

	}

}
