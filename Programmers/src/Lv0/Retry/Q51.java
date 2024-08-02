package Lv0.Retry;

import java.util.*;

/*
	< 코딩테스트 입문 : 외계어 사전 > 
	
	✔️결과 : +1
	
	정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.
	변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
	만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
	stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
	stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
	위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.
	
	제한사항)
	1 ≤ arr의 길이 ≤ 100,000
	1 ≤ arr의 원소 ≤ 100,000
*/

// ★ 데이터를 순서대로 쌓는 자료구조 : Stack - 후입선출(LIFO) 가장 나중에 들어온 데이터를 먼저 처리할 때 사용
// ★ Stack이 비어 있을 때 peek()하면 오류 발생
// ★ Stack을 array로 변환 : stack.stream().mapToInt(i -> i).toArray();

public class Q51 {
	public int[] solution(int[] arr) {
        int[] stk = {};
        List<Integer> list = new ArrayList<Integer>();
        int temp = 0;
        while(temp < arr.length) {
            if(list.size() == 0) {
                list.add(arr[temp]);
                temp ++;
            }else {
                if(list.get(list.size()-1) < arr[temp]) {
                    list.add(arr[temp]);
                    temp ++;
                }else {
                    list.remove(list.size()-1);
                }
            }
        }
        stk = list.stream().mapToInt(Integer::intValue).toArray();
        return stk;
    }
	
	
	// 다른분 풀이
	/*
		Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            while (!stack.isEmpty() && num <= stack.peek()) //마지막 원소 반환
                stack.pop(); //빼기
            stack.push(num); //추가
        }

        return stack.stream().mapToInt(i -> i).toArray();
    */
}
