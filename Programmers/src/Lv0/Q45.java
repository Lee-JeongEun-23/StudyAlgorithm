package Lv0;

import java.util.*;

/*
	< 코딩테스트 입문 : 영어가 싫어요 > 
	
	✔️결과 : +1
	
	영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
	문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
	
	제한사항)
	numbers는 소문자로만 구성되어 있습니다.
	numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.
	1 ≤ numbers의 길이 ≤ 50
	"zero"는 numbers의 맨 앞에 올 수 없습니다.
*/

public class Q45 {
	public long solution(String numbers) {
        long answer = 0;
        String x = "";
        while(!numbers.equals("")) {
            String[] arr = numbers.split("");
            String temp = "";
            for(int i = 0; i < arr.length; i++) {
                temp += arr[i];
                switch (temp) {
                case "zero":
                    x += "0";
                    numbers = numbers.substring(4, numbers.length());
                    break;
                case "one":
                    x += "1";
                    numbers = numbers.substring(3, numbers.length());
                    break;
                case "two":
                    x += "2";
                    numbers = numbers.substring(3, numbers.length());
                    break;
                case "three":
                    x += "3";
                    numbers = numbers.substring(5, numbers.length());
                    break;
                case "four":
                    x += "4";
                    numbers = numbers.substring(4, numbers.length());
                    break;
                case "five":
                    x += "5";
                    numbers = numbers.substring(4, numbers.length());
                    break;
                case "six":
                    x += "6";
                    numbers = numbers.substring(3, numbers.length());
                    break;
                case "seven":
                    x += "7";
                    numbers = numbers.substring(5, numbers.length());
                    break;
                case "eight":
                    x += "8";
                    numbers = numbers.substring(5, numbers.length());
                    break;
                case "nine":
                    x += "9";
                    numbers = numbers.substring(4, numbers.length());
                    break;
                }
            }
        }
        answer = Long.parseLong(x);
        return answer;
    }
	
	
	// 다른분 풀이
	/*
		String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i)); //zero > "0" 이런식으로 변환
        }

        long answer = Long.parseLong(numbers);
        return answer;
    */
}
