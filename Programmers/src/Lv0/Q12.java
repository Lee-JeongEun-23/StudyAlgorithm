package Lv0;

import java.util.*;

/*
	< 코딩테스트 입문 : 최빈값 구하기 > 
	
	✔️결과 : +3
	
	최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
	정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
	최빈값이 여러 개면 -1을 return 합니다.
	
	제한사항)
	0 < array의 길이 < 100
	0 ≤ array의 원소 < 1000
*/

//★ getOrDefault(Object key, V DefaultValue) : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드 (defaultValue : 지정된 키로 매핑된 값이 없거나 null이면 반환하는 기본 값)

public class Q12 {
	public int solution(int[] array) {
        int answer = 0;
        if(array.length == 1) {
            answer = array[0];
        }else {
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i = 0; i < array.length; i++) {
                if(map.containsKey(array[i])) {
                    map.put(array[i], map.get(array[i])+1);
                }else {
                    map.put(array[i], 1);
                }
                /*
                 for(int key : array) {
		        	map.put(key, map.getOrDefault(key, 0) + 1); 
		        } 
                */
                
            }
            Set<Integer> keys = map.keySet();
            int temp = 0;
            int count = 0;
            for(int key : keys) {
                if(map.get(key) > temp) {
                    answer = key;
                    temp = map.get(key);
                    count = 0;
                }else if(map.get(key) == temp) {
                    count++;
                }
            }
            answer = count > 0 ? -1 : answer;
        }
        return answer;
    }
	
	
	// 다른분 풀이
	/*
		int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    */
}
