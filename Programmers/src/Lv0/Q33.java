package Lv0;

/*
	< 코딩 기초 트레이닝 : 문자열 겹쳐쓰기 >
	
	✔️결과 : +1
	
	문자열 my_string, overwrite_string과 정수 s가 주어집니다.
	문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
	
	제한사항)
	my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
	1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
	0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
*/

public class Q33 {
	public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String[] my = my_string.split("");
        String[] arr = overwrite_string.split("");

        for(int i = 0; i < arr.length; i++) {
            my[i+s] = arr[i];
        }
        answer = String.join("", my);
        return answer;
    }
	
	
	// 다른분 풀이
	/*
		String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;
    */	
}
