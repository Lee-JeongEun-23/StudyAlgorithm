package Lv0.Retry;

/*
	< 코딩테스트 입문 : 이진수 더하기 > 
	
	✔️결과 : +3
	
	이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
	
	제한사항)
	return 값은 이진수를 의미하는 문자열입니다.
	1 ≤ bin1, bin2의 길이 ≤ 10
	bin1과 bin2는 0과 1로만 이루어져 있습니다.
	bin1과 bin2는 "0"을 제외하고 0으로 시작하지 않습니다.
*/

// ★ 2진수 > 10진수 : Integer.parseInt(String, 2); ex) 10 > 2
// ★ 10진수 > 2진수 : Integer.toBinaryString(A); ex) 2 > 10

public class Q56 {
	public String solution(String bin1, String bin2) {
        String answer = "";

        int length = Math.max(bin1.length(), bin2.length());
        bin1 = bin1.length() == length ? bin1 : "*".repeat(length-bin1.length())+bin1;
        bin2 = bin2.length() == length ? bin2 : "*".repeat(length-bin2.length())+bin2;

        String[] arr1 = bin1.split("");
        String[] arr2 = bin2.split("");


        String plus = "";
        for(int i = length-1; i >=0; i--) {
            String temp1 = arr1[i].equals("*") ? "" : arr1[i];
            String temp2 = arr2[i].equals("*") ? "" : arr2[i];

            if(plus.equals("")) {
                if(temp1.equals("1") && temp2.equals("1")) {
                    answer = "0"+answer;
                    plus = "1";
                }else if((temp1.equals("0") || temp1.equals("")) && (temp2.equals("0") || temp2.equals(""))) {
                    answer = "0"+answer;
                }else {
                    answer = "1"+answer;
                }
            }else {
                if(temp1.equals("1") && temp2.equals("1")) {
                    answer = "1"+answer;
                    plus = "1";
                }else if((temp1.equals("0") || temp1.equals("")) && (temp2.equals("0") || temp2.equals(""))) {
                    answer = "1"+answer;
                    plus = "";
                }else {
                    answer = "0"+answer;
                    plus = "1";
                }
            }
        }
        answer = plus.equals("") ? answer : "1"+answer;
        return answer;
    }
	
	
	// 다른분 풀이
	/*
		return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    */
}
