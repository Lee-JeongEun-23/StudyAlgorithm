package Lv0.Retry;

/*
	< 코딩 기초 트레이닝 : 정사각형으로 만들기 >
	
	✔️결과 : +4
	
	이차원 정수 배열 arr이 매개변수로 주어집니다.
	arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고, 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
	
	제한사항)
	1 ≤ arr의 길이 ≤ 100
	1 ≤ arr의 원소의 길이 ≤ 100
	arr의 모든 원소의 길이는 같습니다.
	1 ≤ arr의 원소의 원소 ≤ 1,000
*/

// ★ 이차원배열 출력 : Arrays.deepToString(배열);
// ★ int 배열은 0으로 기본 값 초기화 됨
// ★ System.arraycopy(원본배열, 원본 배열의 복사 시작 지점, 복사할 배열, 복사할 배열의 복사 시작 지점, 복사할 요소의 개수)
// ★ Arrays.copyOf(원본배열, 원본 배열에서 복사해올 길이)

public class Q38 {
	public int[][] solution(int[][] arr) {
        int[][] answer = {};
        if(arr.length > arr[0].length) {
            answer = new int[arr.length][arr.length];
            for(int i = 0; i < answer.length; i++) {
                int[] temp = arr[i];
                int[] data = new int[arr.length];
                for(int j = 0; j < data.length; j++) {
                    if(j < temp.length) {
                        data[j] = temp[j];
                    }
                    answer[i] = data;
                }
            }
        }else if(arr.length == arr[0].length){
            answer = arr;
        }else {
            answer = new int[arr[0].length][arr[0].length];
            for(int i = 0; i < answer.length; i++) {
                if(i < arr.length) {
                    answer[i] = arr[i];
                }
            }
        }
        return answer;
    }
    
    
	// 다른분 풀이
	/*
		int max = Math.max(arr.length, arr[0].length);
        int[][] array = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, array[i], 0, arr[0].length);
	    }
	    return array;
    */
}
