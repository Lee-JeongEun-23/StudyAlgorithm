package Lv0;

/*
	< 코딩 기초 트레이닝 : 그림 확대 > 
	
	✔️결과 : +1
	
	직사각형 형태의 그림 파일이 있고, 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다.
	이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때, 이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
	
	제한사항)
	1 ≤ picture의 길이 ≤ 20
	1 ≤ picture의 원소의 길이 ≤ 20
	모든 picture의 원소의 길이는 같습니다.
	picture의 원소는 '.'과 'x'로 이루어져 있습니다.
	1 ≤ k ≤ 10
*/

public class Q36 {
	public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];

        for(int i = 0; i < picture.length; i++) {
            String[] arr = picture[i].split("");
            String temp = "";
            for(int j = 0; j < arr.length; j++) { //repeat 함수를 쓰면 됨
                for(int num = 0; num < k; num++) {
                    temp += arr[j];
                }
            }
            for(int num = 0; num < k; num++) {
                answer[k*i+num] = temp;
            }
        }
        return answer;
    }
	
	
	// 다른분 풀이
	/*
		String[] answer = new String[picture.length * k];
        int idx = 0;

        for(int i=0; i<picture.length; i++) {
            for(int j=0; j<k; j++) {
                StringBuilder sb = new StringBuilder();

                for(int l=0; l<picture[i].length(); l++) {
                    sb.append(String.valueOf(picture[i].charAt(l)).repeat(k));
                }

                answer[idx++] = sb.toString();
            }
        }

        return answer;
    */
}
