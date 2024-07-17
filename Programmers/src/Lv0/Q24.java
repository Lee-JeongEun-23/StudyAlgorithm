package Lv0;

import java.util.*;

/*
	< 코딩테스트 입문 : 등수 매기기 > 
	
	✔️결과 : +7
	
	영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
	영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
	
	제한사항)
	0 ≤ score[0], score[1] ≤ 100
	1 ≤ score의 길이 ≤ 10
	score의 원소 길이는 2입니다.
	score는 중복된 원소를 갖지 않습니다.
*/

public class Q24 {
	public int[] solution(int[][] score) {
        double[] data = new double[score.length];
        int[] answer = new int[score.length];

        for(int i = 0; i < score.length; i++) {
            data[i] = (((double)score[i][0]+(double)score[i][1])/2);
        }

        double[] arr = Arrays.copyOf(data, score.length);
        Arrays.sort(arr);

        int count = 1;
        int rank = 0;
        double temp = 0;
        for(int i = arr.length-1; i >= 0; i--) {
            if(temp != arr[i]) {
                if(count == 1) {
                    rank ++;
                }else {
                    rank += count;
                }
                count = 1;
                temp = arr[i];
            }else {
                count++;
            }
            for(int j = 0; j < data.length; j++) {
                if(data[j] == arr[i]) {
                    answer[j] = rank;
                }
            }
        }
        return answer;
    }
	
	
	// 다른분 풀이
	/*
		List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
        }
        return answer;
    */
}
