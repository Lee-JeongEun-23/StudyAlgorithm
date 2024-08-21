package Lv1.Retry;

/*
	< 연습문제 : 이상한 문자 만들기 >
	
	문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
	각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
	각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
	
	제한사항)
	문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
	첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
*/

public class Q36 {
	public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
		int start = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(" ")) {
				answer += " ";
				start = 0;
			}else {
				if(start == 0 || start % 2 == 0) {
					answer += arr[i].toUpperCase();
					start++;
				}else {
					answer += arr[i].toLowerCase();
					start++;
				}
			}
		}
        return answer;
    }
	
	// 다른분 풀이
	/*
		String answer = "";
		int cnt = 0;
		String[] array = s.split("");
		
		for(String ss : array) {
		    cnt = ss.contains(" ") ? 0 : cnt + 1;
		    answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
		}
      	return answer;
    */
}
