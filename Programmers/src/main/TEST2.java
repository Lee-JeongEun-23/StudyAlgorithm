package main;

import java.util.*;

public class TEST2 {
/*
	영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
	영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
	
	[[80, 70], [90, 50], [40, 70], [50, 80]]	[1, 2, 4, 3]
	[[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]	[4, 4, 6, 2, 2, 1, 7]
	
	
	[[1,2],[1,1]]

 */
	public static void main(String[] args) {

		int[][] score = {{1,2},{1,2},{1,1},{5,2}}; //3, 3, 2, 7
		
		List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        System.out.println(scoreList); //[7, 3, 3, 2]
        
        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
        	System.out.println(scoreList.indexOf(score[i][0] + score[i][1]));
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
            
        }
		
		System.out.println(Arrays.toString(answer));
	}
}

