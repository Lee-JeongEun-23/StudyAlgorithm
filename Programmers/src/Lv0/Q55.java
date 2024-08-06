package Lv0;

import java.util.*;

/*
	< 코딩테스트 입문 : 소인수분해 > 
	
	✔️결과 : +3
	
	소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
	예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
	따라서 12의 소인수는 2와 3입니다.
	자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
	
	제한사항)
	2 ≤ n ≤ 10,000
*/

// ★ LinkedHashSet : 삽입된 순서대로 반복하고 중복 값 허용 X
// ★ LinkedHashSet 초기화 : LinkedHashSet<Integer> set = new LinkedHashSet<>();

public class Q55 {
	public int[] solution(int n) {
        int temp = 2;
        List<Integer> list = new ArrayList<Integer>();
        while(n != 1) {
            if(n % temp == 0) {
                n = n / temp;
                if(!list.contains(temp)) {
                    list.add(temp);
                }
                temp = 2;
            }else {
                temp ++;
            }
        }
        Collections.sort(list);
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
	
	
	// 다른분 풀이
	/*
		LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
        int i = 2;
        while (n != 0 && i <= n) {
            if (n % i == 0) {
                primeNumbers.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        return primeNumbers.stream().mapToInt(Integer::intValue).toArray();
    */
}
