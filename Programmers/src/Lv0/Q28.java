package Lv0;

import java.util.*;

/*
	< 코딩 기초 트레이닝 : 대소문자 바꿔서 출력하기 > 
	
	✔️결과 : +1
	
	영어 알파벳으로 이루어진 문자열 str이 주어집니다.
	각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
	
	제한사항)
	1 ≤ str의 길이 ≤ 20
	str은 알파벳으로 이루어진 문자열입니다.
*/

public class Q28 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("");
        for(int i = 0; i < arr.length; i++) {
            if((int)arr[i].charAt(0) >= 65 &&  (int)arr[i].charAt(0) <= 90) {
                arr[i] = arr[i].toLowerCase();
            }else {
                arr[i] = arr[i].toUpperCase();
            }
        }
        System.out.println(String.join("",arr));
    }
}
