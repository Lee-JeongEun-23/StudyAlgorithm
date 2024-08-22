package Lv0.Retry;

import java.util.*;

/*
	< 코딩 기초 트레이닝 : 배열의 길이를 2의 거듭제곱으로 만들기 > 
	
	✔️결과 : +5
	
	정수 배열 arr이 매개변수로 주어집니다.
	arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
	arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
	
	제한사항)
	1 ≤ arr의 길이 ≤ 1,000
	1 ≤ arr의 원소 ≤ 1,000
*/
public class Q77 {
	public int[] solution(int[] arr) {
        int n = 0;
        for(int i = 0; i <= 10; i++){
           if(arr.length <= (int)Math.pow(2, i)) {
               n = i;
               break;
           }
        }
        int[] answer = Arrays.copyOf(arr, (int)Math.pow(2, n));
        return answer;
    }
	
	
	// 다른분 풀이
	/*
		int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    */
}
