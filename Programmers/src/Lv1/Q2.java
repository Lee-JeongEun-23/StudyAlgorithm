package Lv1;

/*
	< 연습문제 : 약수의 합 > 
	
	정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
	
	제한사항)
	n은 0 이상 3000이하인 정수입니다.
*/

public class Q2 {
	public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}
        return answer;
    }
}
