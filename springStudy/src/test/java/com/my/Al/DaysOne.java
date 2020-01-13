package com.my.Al;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;

import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;
public class DaysOne {

	
	/**
	
	���� ����
	�Ʒ��� ���� 5�� ��Ģ���길���� 12�� ǥ���� �� �ֽ��ϴ�.

	12 = 5 + 5 + (5 / 5) + (5 / 5)
	12 = 55 / 5 + 5 / 5
	12 = (55 + 5) / 5

	5�� ����� Ƚ���� ���� 6,5,4 �Դϴ�. �׸��� ���� ���� ���� ���� 4�Դϴ�.
	��ó�� ���� N�� number�� �־��� ��, N�� ��Ģ���길 ����ؼ� ǥ�� �� �� �ִ� ��� �� N ���Ƚ���� �ּڰ��� return �ϵ��� solution �Լ��� �ۼ��ϼ���.

	���ѻ���
	N�� 1 �̻� 9 �����Դϴ�.
	number�� 1 �̻� 32,000 �����Դϴ�.
	���Ŀ��� ��ȣ�� ��Ģ���길 �����ϸ� ������ ���꿡�� �������� �����մϴ�.
	�ּڰ��� 8���� ũ�� -1�� return �մϴ�.
	����� ��
	N	number	return
	5	12	4
	2	11	3
	����� �� ����
	���� #1
	������ ���� ���� �����ϴ�.

	���� #2
	11 = 22 / 2�� ���� 2�� 3���� ����Ͽ� ǥ���� �� �ֽ��ϴ�.

	*/
	

	@Test
	public void testRun() {
		
		 dfs() ;
		 
		//assertEquals(solution(5, 12), 4);
		//assertEquals(solution(2, 11), 3);
		
	}
	
	
	int solution(int N, int number) {
	    int answer = -1;
	  
	    dfs();
	    return answer;
	}
	
	public void dfs() {
		
		  for(int i =  0; i <8; i++) {
			  System.out.print("+");   
		  }
		  System.out.println("");
		  
		  for(int i =  0; i <8; i++) {
			  System.out.print("%");   
		  }
		  System.out.println("");
		  for(int i =  0; i <8; i++) {
			  System.out.print("*");   
		  }
		  System.out.println("");
		  
		  for(int i =  0; i <8; i++) {
			  System.out.print("-");   
		  }
		  System.out.println("");
		
		
	}
	
	
	
}
