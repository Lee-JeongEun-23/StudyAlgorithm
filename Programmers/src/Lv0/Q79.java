package Lv0;

/*
	< 코딩 기초 트레이닝 : 간단한 논리 연산 > 
	
	✔️결과 : +1
	
	boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
	(x1 ∨ x2) ∧ (x3 ∨ x4)
	
	∨과 ∧의 진리표는 다음과 같습니다.

	x	y	x ∨ y	x ∧ y
	T	T	T		T
	T	F	T		F
	F	T	T		F
	F	F	F		F
*/

//	★ 논리합 : true || true > true / true || false > true	/ false || true > true / false || false > false
//	★ 논리곱 : true && true > true / true && false > false / false && true > false / false && false > false

public class Q79 {
	public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean[][] arr = {{x1,x2},{x3,x4}};
        boolean[] arr2 = new boolean[2];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i][0] == arr[i][1] && arr[i][0]) {
                arr2[i] = true;
            }else if (arr[i][0] == arr[i][1] && !arr[i][0]) {
                arr2[i] = false;
            }else {
                arr2[i] = true;
            }
        }
        if(arr2[0] != arr2[1] || !arr2[0]) {
            answer = false;
        }
        return answer;
    }
	
	
	// 다른분 풀이
	/*
		boolean answer = (x1||x2)&&(x3||x4);
        return answer;
    */
}
