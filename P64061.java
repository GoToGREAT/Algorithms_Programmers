package programmers;

import java.util.ArrayList;
import java.util.List;



public class P64061 {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		Solutione q = new Solutione();
		q.solution(board, moves);
		
	}	
}

class Solutione{
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> fi = new ArrayList<>();
        for(int i=0; i<moves.length; i++){
            int a = moves[i];
            for(int k=0; k<board.length; k++){
                if(board[k][a-1]!=0){
                    fi.add(board[k][a-1]);
                    board[k][a-1]=0;
                    break;
                }
            }
            
            if(fi.size()>1){
            	int q = fi.size()-1;
                if(fi.get(q)==fi.get(q-1)){
                    answer += 2;
                    fi.remove(q);
                    fi.remove(q-1);
                }
            }
            
        }
        return answer;
    }
}