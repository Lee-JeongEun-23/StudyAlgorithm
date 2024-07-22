package Lv0.Retry;

/*
	< 코딩테스트 입문 : 문자열 밀기 >
	
	문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
	이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
	
	제한사항)
	0 < A의 길이 = B의 길이 < 100
	A, B는 알파벳 소문자로 이루어져 있습니다.

*/

// ★ String 배열을 String으로 변환 : String.join(구분자,배열);
// ★ repeat 함수 : 문자열 반복 메서드

public class Q19 {
	public int solution(String A, String B) {
        int answer = -1;

		if(A.equals(B)) {
			answer = 0;
		}else {
			String[] arrA = A.split("");
			String[] arr = new String[arrA.length];
			int count = 1;
			while(count <= arrA.length-1) {
				for(int i = 0; i < arrA.length; i++) {
					if(count+i >= arrA.length) {
						arr[Math.abs(count+i-arrA.length)] = arrA[i];
					}else {
						arr[count+i] = arrA[i];
					}
					
				}
				String temp = String.join("", arr);
				if(temp.equals(B)) {
					answer = count;
					break;
				}
				count++;
				arr = new String[arrA.length];
			}
		}
        return answer;
    }
	
	public int solution2(String A, String B) { //2022-10-12
        int answer = -1;

		String[] arr = A.split("");
		String temp = "";
		int end = arr.length-1;
		int count = 0;
        if(A.equals(B)){
            return 0;
        }
		while(count != arr.length) {
			temp = "";
			for(int i = end; i <= arr.length-1; i++) {
				temp += arr[i];
			}
			for(int i = 0; i < end; i++) {
				temp += arr[i];
			}
			end--;
			count++;
			if(temp.equals(B)) {
				answer = count;
				break;
			}
		}
        return answer;
    }
	
	
	// 다른분 풀이
	/*
		String tempB = B.repeat(2);
        return tempB.indexOf(A);
        
        return (B+B).indexOf(A);
    */
}
