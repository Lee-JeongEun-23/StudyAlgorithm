package Lv0.Retry;

import java.util.*;

/*
	< 코딩 기초 트레이닝 : 무작위로 K개의 수 뽑기 >
	
	✔️결과 : +5
	
	랜덤으로 서로 다른 k개의 수를 저장한 배열을 만드려고 합니다.
	적절한 방법이 떠오르지 않기 때문에 일정한 범위 내에서 무작위로 수를 뽑은 후, 지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식으로 만들기로 합니다.
	이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상해봅시다.
	정수 배열 arr가 주어집니다.
	문제에서의 무작위의 수는 arr에 저장된 순서대로 주어질 예정이라고 했을 때, 완성될 배열을 return 하는 solution 함수를 완성해 주세요.
	단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.
		
	제한사항)
	1 ≤ arr의 길이 ≤ 100,000
	0 ≤ arr의 원소 ≤ 100,000
	1 ≤ k ≤ 1,000
*/

public class Q44 {
	public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}		
		for(int i = 0; i < k; i++) {
			if(i < list.size()) {
				answer[i] = list.get(i);
			}else {
				answer[i] = -1;
			}
		}
        return answer;
    }
	
	
	// 기존 오답
	/*
		public int[] solution(int[] arr, int k) {
	        int[] answer = new int[k];
	
	        int cnt = 0;
	        String temp = "";
	        for(int i = 0; i < arr.length; i++) {
	            if(cnt != k && temp.indexOf(String.valueOf(arr[i])) < 0) {
                    answer[cnt] = arr[i];
                    temp += String.valueOf(arr[i]); 
                    cnt++;
                }
	        }
	        for(int i = cnt; i < answer.length; i++) {
	            answer[i] = -1;
	        }
	        return answer;
    	}
    	
    	반례 : arr = [11, 1]; k = 2;
    	문자로 변환하여 비교하다 보니 이미 1이 있어서 if문에 안걸림
    	답이 [11, 1]로 나와야 하지만 위 코드로 하면 [11, -1]로 나옴 따라서 오류!
    */
}
