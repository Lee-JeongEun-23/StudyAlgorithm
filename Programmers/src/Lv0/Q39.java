package Lv0;

import java.util.*;

/*
	< 코딩테스트 입문 : 외계어 사전 > 
	
	✔️결과 : +1
	
	직각삼각형이 주어졌을 때 빗변의 제곱은 다른 두 변을 각각 제곱한 것의 합과 같습니다.
	직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가 주어질 때, 다른 한 변의 길이의 제곱, b_square 을 출력하도록 한 줄을 수정해 코드를 완성해 주세요.
	
	제한사항)
	1 ≤ a < c ≤ 100
*/

public class Q39 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (int)(Math.pow(c, 2) - Math.pow(a, 2));

        System.out.println(b_square);
    }
	
	
	// 다른분 풀이
	/*
		int b_square = (c - a) * (c + a); //합차공식 : a² - b² = (a+b)(a-b)
    */
}
