package Lv0.Retry;

import java.util.*;

/*
	< 코딩 기초 트레이닝 : 배열 조각하기 > 
	
	✔️결과 : +8
	
	정수 배열 arr와 query가 주어집니다.
	query를 순회하면서 다음 작업을 반복합니다.
	짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
	홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
	위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
	
	제한사항)
	5 ≤ arr의 길이 ≤ 100,000
	0 ≤ arr의 원소 ≤ 100
	1 ≤ query의 길이 < min(50, arr의 길이 / 2)
	query의 각 원소는 0보다 크거나 같고 남아있는 arr의 길이 보다 작습니다.
*/

// ★ ArrayList를 int 배열로 변경 : int[] answer = intArr.stream().mapToInt(Integer::intValue).toArray();
// ★ Arrays.copyOfRange(원배열, 복사 시작 인덱스, 복사 끝 인덱스);

public class Q13 {
	public int[] solution(int[] arr, int[] query) {
        List<Integer> intArr = new ArrayList<Integer>();
        for(int i = 0 ; i < arr.length; i++) {
            intArr.add(arr[i]);
        }
        for(int i = 0; i < query.length; i++) {
            if(i%2 == 0) {
                for(int j = intArr.size()-1; j > query[i]; j--) {
                    intArr.remove(j);
                }
            }else {
                for(int j = query[i]-1; j >= 0; j--) {
                    intArr.remove(j);
                }
            }
        }

        int[] answer = intArr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
	
	
	// 다른분 풀이
	/*
		int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] - 1;
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 2);
    */
}
