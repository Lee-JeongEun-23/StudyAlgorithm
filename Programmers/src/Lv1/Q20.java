package Lv1;

import java.util.*;

/*
	< 연습문제 : 나누어 떨어지는 숫자 배열 >
	
	array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
	divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
	
	제한사항)
	arr은 자연수를 담은 배열입니다.
	정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
	divisor는 자연수입니다.
	array는 길이 1 이상인 배열입니다.
*/

// ★ 배열에서 특정 값들만 고르기 : Arrays.stream(배열).filter(인자 -> 인자 [조건]).toArray();

public class Q20 {
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		if(list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			Collections.sort(list);
			answer = list.stream().mapToInt(Integer::intValue).toArray();
		}
        return answer;
    }
	
	// 다른분 풀이
	/*
		int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
		if(answer.length == 0) answer = new int[] {-1};
		java.util.Arrays.sort(answer);
		return answer;
    */
}
