package Lv0.Retry;

import java.util.*;

/*
	< 코딩테스트 입문 : 특이한 정렬 > 
	
	✔️결과 : +4
	
	정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
	이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
	정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
	
	제한사항)
	1 ≤ n ≤ 10,000
	1 ≤ numlist의 원소 ≤ 10,000
	1 ≤ numlist의 길이 ≤ 100
	numlist는 중복된 원소를 갖지 않습니다.
*/

// ★ Map key로 정렬 : arrayList로 정렬
//	List<Integer> keySet = new ArrayList<>(map.keySet());
//	Collections.sort(keySet);

public class Q21 {
	public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Map<Integer,String> map = new HashMap<Integer,String>();

        Arrays.sort(numlist);
        for(int i = 0 ; i < numlist.length; i++) {
            int temp = Math.abs(n-numlist[i]);
            if(map.containsKey(temp)) {
                map.put(temp, map.get(temp).toString()+","+String.valueOf(numlist[i]));
            }else {
                map.put(temp, String.valueOf(numlist[i]));
            }
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        int i = 0;
        for (Integer key : keySet) {
            if(map.get(key).indexOf(",") > -1) {
                String[] temp = map.get(key).toString().split(",");
                answer[i] = Integer.parseInt(temp[1]);
                answer[i+1] = Integer.parseInt(temp[0]);
                i++;
            }else {
                answer[i] = Integer.parseInt(map.get(key));
            }
            i++;
        }
        return answer;
    }
}
