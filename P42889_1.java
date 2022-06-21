package programmers;

import java.util.Arrays;
import java.util.HashMap;


// 아무도 도전하지 못한 스테이지 처리 후 통과
public class P42889_1 {
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		Solutionr s = new Solutionr();
		int[] fi =  s.solution(N, stages);
		for(int i=0; i<fi.length; i++) {
			System.out.println(fi[i]);
		}
	}	
}

class Solutionr {
    public int[] solution(int N, int[] stages) {
            Arrays.sort(stages);
        
            double[] percent = new double[N];
            HashMap<Integer, Double> map = new HashMap<>();
            int[] answer = new int[N];
        
            int full = 0; // stage 어디부터 시작할지 정하기
            int a = stages.length; // 분모
        
            for(int i=0; i<N;i++){                
                int cnt = 0;
                for(int k=full; k<stages.length; k++){
                    if(stages[k]==(i+1)){
                        cnt++;
                    } else{
                        break;
                    }                    
                }    
                full += cnt;
                System.out.println(cnt);
                percent[i] =(double) cnt/a ;
                System.out.println(i+" / "+cnt+"나누기"+a+" = "+percent[i]);
                map.put(i+1,percent[i]);
                a-=cnt;
                
                if(a<0 || a==0) {
                	for(int q=i+1; q<N; q++) {
                		percent[q] =(double) 0 ;
                		map.put(q+1,percent[q]);
                	}
                	break;
                }
            }
            
            Arrays.sort(percent);
               
            for(int i=0; i<percent.length; i++){
            	for(int k=0; k<map.size(); k++) {
            		if(map.get(k+1)==percent[N-i-1]) {
            			answer[i] = k+1;
            			map.replace(k+1, -1.0);
            			break;            			
            		}
            	}
            }        
        
	        return answer;
    }
}