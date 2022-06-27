
import java.util.Arrays;
import java.util.HashMap;



// ���� �߻� : �ߺ��Ǵ� Ȯ���� ���� �� �ռ� �������� ��ȣ�� ã�� ����.
public class P42889 {
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] result = {3,4,2,1,5};
		
		Solutionz s = new Solutionz();
		int[] fi =  s.solution(N, stages);
		for(int i=0; i<fi.length; i++) {
			System.out.println(fi[i]);
		}
	}	
}

class Solutionz {
    public int[] solution(int N, int[] stages) {
            Arrays.sort(stages);
        
            double[] percent = new double[N];
            HashMap<Double, Integer> map = new HashMap<Double, Integer>();
            int[] answer = new int[N];
        
            int full = 0; // stage ������ �������� ���ϱ�
            int a = stages.length; // �и�        
        
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
                System.out.println(i+" / "+cnt+"������"+a+" = "+percent[i]);
                map.put(percent[i],i+1);
                a-=cnt;
            }
            
            Arrays.sort(percent);
               
            for(int i=0; i<percent.length; i++){
                answer[i] = map.get(percent[N-i-1]);
            }        
        
	        return answer;
    }
}