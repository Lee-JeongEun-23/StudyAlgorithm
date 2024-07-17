package Lv0;

/*
	< 코딩테스트 입문 : 유한소수 판별하기 > 
	
	✔️결과 : +7
	
	소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다.
	분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다.
	유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
	기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
	두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.
	
	제한사항)
	a, b는 정수
	0 < a ≤ 1,000
	0 < b ≤ 1,000
*/

//★ 최대공약수 : 재귀함수로 구하기
//	private static int gcd(int a, int b) {  //최대공약수
//		if (a % b == 0) {
//    		return b;
//		}
//		return gcd(b, a%b);
//	}

public class Q23 {
	public int solution(int a, int b) {
        int answer = 0;
        int c = gcd(a, b);
        a = a / c;
        b = b / c;

        while(b/2 != 0 && b%2 == 0) {
            b = b/2;            
        }
        while(b/5 != 0 && b%5 == 0) {
            b = b/5;            
        }

        if(b == 1) {
            answer = 1;
        }else {
            answer = 2;
        }
        return answer;
    }

    private static int gcd(int a, int b) {  //최대공약수
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
	
	
	// 다른분 풀이
	/*
		b /= gcd(a, b);

        while (b % 2 == 0)
            b /= 2;

        while (b % 5 == 0)
            b /= 5;

        return b == 1 ? 1 : 2;
    */
}
