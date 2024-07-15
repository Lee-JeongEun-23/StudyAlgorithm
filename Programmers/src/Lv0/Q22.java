package Lv0;

/*
	< 코딩테스트 입문 : 저주의 숫자 3 > 
	
	✔️결과 : +4
	
	3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다.
	3x 마을 사람들의 숫자는 다음과 같습니다.
	
	10진법	3x 마을에서 쓰는 숫자		10진법	3x 마을에서 쓰는 숫자
	1		1					6		8
	2		2					7		10
	3		4					8		11
	4		5					9		14
	5		7					10		16
	
	정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 solution 함수를 완성해주세요.
	
	제한사항)
	1 ≤ n ≤ 100
*/

public class Q22 {
	public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            answer ++;
            answer = getNum(answer);
        }
        return answer;
    }

    private static int getNum(int temp) {
        if(temp % 3 == 0 || String.valueOf(temp).contains("3")) {
            temp++;
            return getNum(temp);
        }else {
            return temp;
        }
    }
    
    
	// 다른분 풀이
	/*
		int answer = 0;
		for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }
        return answer;
    */
}
