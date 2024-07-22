package Lv1.Retry;

/*
	< 월간 코드 챌린지 시즌3 : 나머지가 1이 되는 수 찾기 > 
	
	자연수 n이 매개변수로 주어집니다.
	n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
	답이 항상 존재함은 증명될 수 있습니다.
	
	제한사항)
	3 ≤ n ≤ 1,000,000
*/

public class Q1 {
	public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 1000000; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    
	// 다른분 풀이
	/*
		int answer = 1;

        while(n % answer != 1){
            answer++;
        }
        return answer;
    */
}
