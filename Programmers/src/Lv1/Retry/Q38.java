package Lv1.Retry;

/*
	< 연습문제 : 시저 암호 >
	
	어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
	예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
	"z"는 1만큼 밀면 "a"가 됩니다.
	문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
	
	제한사항)
	공백은 아무리 밀어도 공백입니다.
	s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
	s의 길이는 8000이하입니다.
	n은 1 이상, 25이하인 자연수입니다.
*/

public class Q38 {
	public String solution(String s, int n) {
        String answer = "";
        String[] arr = s.split("");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(" ")) {
				answer += " ";
			}else {
				int temp = arr[i].charAt(0)+n;
				if((arr[i].charAt(0) <= 90 && temp > 90) ||  temp > 122) {
					temp = arr[i].charAt(0)+n - 26;
				}
				char data = (char)temp;
				answer += String.valueOf(data);
			}
		}
        return answer;
    }
	
	// 다른분 풀이
	/*
		String answer = "";
        for(char ch : s.toCharArray()) {
            if(ch==' ') {
                answer += ch;
            }else if(ch>='a'&& ch<='z'){
                answer += (char)('a' + (ch+n-'a')%26);
            }else {
                answer += (char)('A' + (ch+n-'A')%26);
            }
        }
        System.out.println(answer);
        return answer;
    */
}
