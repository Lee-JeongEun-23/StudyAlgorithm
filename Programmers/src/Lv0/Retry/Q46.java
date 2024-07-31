package Lv0.Retry;

import java.math.*;

/*
	< 코딩테스트 입문 : 외계어 사전 > 
	
	✔️결과 : +1
	
	0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
	
	제한사항)
	1 ≤ a의 길이 ≤ 100,000
	1 ≤ b의 길이 ≤ 100,000
	a와 b는 숫자로만 이루어져 있습니다.
	a와 b는 정수 0이 아니라면 0으로 시작하지 않습니다.
*/

// ★ int 범위 :  -2,147,483,648 ~ 2,147,483,647 / 메모리 크기 : 4 byte
// ★ long 범위 : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 / 메모리 크기 : 8 byte
// ★ BigInteger 범위 : 무한 (Infinity) / 메모리 크기 : min 70 byte
// ★ BigInteger로 변환 BigInteger big = new BigInteger(문자열);
// ★ BigInteger 덧샘 : add() / 뺄셈 : subtract() / 곱셈 : multiply() / 나눗셈 : divide() / 나머지 : remainder()

public class Q46 {
	public String solution(String a, String b) {
        String answer = "";

        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        answer = bigA.add(bigB).toString();
        return answer;
    }
}
