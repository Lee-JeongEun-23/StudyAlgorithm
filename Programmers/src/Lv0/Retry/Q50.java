package Lv0.Retry;

/*
	< 코딩 기초 트레이닝 : 문자 개수 세기 >
	
	✔️결과 : +1	

	알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때,
	my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., my_string에서 'Z'의 개수, my_string에서 'a'의 개수, my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
	
	제한사항)
	1 ≤ my_string의 길이 ≤ 1,000
*/

// ★ String을 char로 변경 : (int)charAt()
// ★ char 대문자 : 65~90 / 소문자 : 97~122

public class Q50 {
	public int[] solution(String my_string) {
        int[] answer = new int[52];     
        String[] arr = my_string.split("");

        for(int i = 0; i < arr.length; i++) {
            int temp = (int)arr[i].charAt(0);
            if(temp <= 90) {
                int x = answer[temp - 65] + 1;
                answer[temp - 65]  = x;
            }else {
                int x = answer[temp - 97 +26] + 1;
                answer[temp - 97 +26] = x;
            }
        }
        return answer;
    }
	

	/*
		int[] answer = new int[52];

        for (char ch : my_string.toCharArray()) {
            int idx = Character.isUpperCase(ch) ? (ch - 'A') : (ch - 'a' + 26);
            answer[idx]++;
        }

        return answer;
    */
}
