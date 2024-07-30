package Lv1;

/*
	< 연습문제 : 문자열 내 p와 y의 개수 >
	
	대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
	s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
	'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
	단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
	예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
	
	제한사항)
	문자열 s의 길이 : 50 이하의 자연수
	문자열 s는 알파벳으로만 이루어져 있습니다.
*/

public class Q13 {
	boolean solution(String s) {
        boolean answer = true;
        String[] arr =s.toLowerCase().split("");        
        int a = 0, b = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("p")) {
                a++;
            }
            if(arr[i].equals("y")) {
                b++;
            }
        }
        if(a != b) {
            answer = false;
        }
        return answer;
    }
	
	// 다른분 풀이
	/*
		s = s.toLowerCase();
        int count = 0; //하나의 변수로도 가능

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;
    */
}
