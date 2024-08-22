package Lv0;

import java.util.*;

/*
	< 코딩테스트 입문 : 진료순서 정하기 > 
	
	✔️결과 : +1
	
	외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
	정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
	
	제한사항)
	중복된 원소는 없습니다.
	1 ≤ emergency의 길이 ≤ 10
	1 ≤ emergency의 원소 ≤ 100
*/

public class Q80 {
	public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
	    int[] temp = Arrays.copyOf(emergency, emergency.length);
	    Arrays.sort(temp);
	    
	    int rank = 1;
	    for(int i = temp.length-1; i >= 0; i--) {
	    	for(int j = 0; j < emergency.length; j++) {
	    		if(temp[i] == emergency[j]) {
	    			answer[j] = rank;
	    			rank++;
	    		}
	    	}
	    }
        return answer;
    }
}
