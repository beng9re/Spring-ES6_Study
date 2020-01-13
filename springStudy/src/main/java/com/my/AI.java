package com.my;

public class AI {
	 int answer = -1;

	    public int solution(int N, int number) {
	        dfs(N, 0, 0, number, "");
	        return answer;
	    }
	    							      //������� //�ο������� //
	    public void dfs(int n, int pos, int num, int number, String s) {
	        if (pos > 8) // ���̰� 8�̸� break;
	            return;
	        
	        if (num == number) {   //���ų� ���ϴ°��  �극��ũ
	        	
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
