package com.my;

public class AI {
	 int answer = -1;

	    public int solution(int N, int number) {
	        dfs(N, 0, 0, number, "");
	        return answer;
	    }
	    							      //연산깊이 //부여받은수 //
	    public void dfs(int n, int pos, int num, int number, String s) {
	        if (pos > 8) // 깊이가 8이면 break;
	            return;
	        
	        if (num == number) {   //빼거나 더하는경우  브레이크
	        	
	            if (pos < answer || answer == -1) {
	                System.out.println(s);
	                answer = pos;
	            }
	            
	            return;
	        }
	        
	        int nn=0;
	        for (int i = 0; i < 8; i++) {
	            nn=nn*10+n;
	            dfs(n, pos + 1+i, num + nn, number, s + "+");
	            dfs(n, pos + 1+i, num - nn, number, s + "-");
	            dfs(n, pos + 1+i, num * nn, number, s + "*");
	            dfs(n, pos + 1+i, num / nn, number, s + "/");
	        }
	        
	    }
	    public static void main(String[] args) {
			AI a =new AI();
			System.out.println(a.solution(5, 12));
			
		}
	
	
}
