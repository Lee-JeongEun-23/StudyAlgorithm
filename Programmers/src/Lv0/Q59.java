package Lv0;

/*
	< 코딩 기초 트레이닝 : qr code > 
	
	✔️결과 : +1
	
	두 정수 q, r과 문자열 code가 주어질 때, code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
	
	제한사항)
	0 ≤ r < q ≤ 20
	r < code의 길이 ≤ 1,000
	code는 영소문자로만 이루어져 있습니다.
*/

// ★ StringBuilder로 문자 합칠 때 : StringBuilder sb = new StringBuilder(); 초기화
//							    sb.append(문자);


public class Q59 {
	public String solution(int q, int r, String code) {
        String answer = "";
        String[] arr = code.split("");

        for(int i = 0; i < arr.length; i++) {
            if(i % q == r) {
                answer += arr[i];
            }
        }
        return answer;
    }
	
	
	// 다른분 풀이
	/*
		StringBuilder sb = new StringBuilder();

        for (int i = r; i < code.length(); i += q)
            sb.append(code.charAt(i));

        return sb.toString();
    */
}
