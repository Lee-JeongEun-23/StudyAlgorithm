package Lv0;

/*
	< 코딩테스트 입문 : 연속된 수의 합 >
	
	✔️결과 : +1
	
	연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
	두 정수 num과 total이 주어집니다.
	연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
	
	제한사항)
	1 ≤ num ≤ 100
	0 ≤ total ≤ 1000
	num개의 연속된 수를 더하여 total이 될 수 없는 테스트 케이스는 없습니다.
*/

public class Q8 {
	public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int temp = (num-1) * num / 2;
        total = (total - temp) / num;

        for(int i = 0; i < answer.length; i++) {
            answer[i] = total;
            total++;
        }
        return answer;
    }
}
