public class P120866 {
	class Solution {
	    public int solution(int[][] board) {
	        int answer = 0;
	        
	        for(int i=0; i<board.length; i++) {
	        	for(int q=0; q<board[0].length; q++) {
	        		if(board[i][q]==0) {
	        			if(i-1>=0 && board[i-1][q]==1
	        			 || i+1<board.length && board[i+1][q]==1
	        			 || q-1>=0 && board[i][q-1]==1
	        			 || q+1<board[0].length && board[i][q+1]==1
	        			 || i-1>=0 && q-1>=0 && board[i-1][q-1]==1
	        			 || i-1>=0 && q+1<board[0].length && board[i-1][q+1]==1
	        			 || i+1<board.length && q-1>=0 && board[i+1][q-1]==1
	        			 || i+1<board.length && q+1<board[0].length && board[i+1][q+1]==1) {continue;}
	        			answer++;
	        		}
	        	}
	        }
	        
	        return answer;
	    }
	}
}