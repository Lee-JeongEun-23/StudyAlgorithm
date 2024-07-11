package Lv0;

import java.util.*;

/*
	< 코딩 기초 트레이닝 : 배열 만들기 2 > 
	
	✔️결과 : +2
	
	정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
	만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
	
	제한사항)
	- 1 ≤ l ≤ r ≤ 1,000,000
*/
public class Q17 {
	public int[] solution(int l, int r) {
        List<Integer> arr = new ArrayList<Integer>();
		for(int i = l; i <= r; i++) {
			if(i % 5 == 0) {
				String temp = String.valueOf(i);
				temp = temp.replaceAll("5", "").replaceAll("0", "");
				if(temp.equals("")) {
					arr.add(i);
				}
			}
		}
		if(arr.size() == 0) {
			arr.add(-1);
		}
		int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
	
	
	// 다른분 풀이
	/*
		ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }

        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    */
}
