package Lv0;

import java.util.*;

/*
	< 코딩 기초 트레이닝 : 왼쪽 오른쪽 > 
	
	✔️결과 : +5
	
	문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다.
	str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를, 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
	"l"이나 "r"이 없다면 빈 리스트를 return합니다.
	
	제한사항)
	1 ≤ str_list의 길이 ≤ 20
	str_list는 "u", "d", "l", "r" 네 개의 문자열로 이루어져 있습니다.
*/

// ★ ArrayList를 String 배열로 변경 : String[] answer = list.toArray(new String[list.size()]);

public class Q54 {
	public String[] solution(String[] str_list) {
        String temp = String.join("", str_list);
        List<String> list = new ArrayList<String>();
        if(temp.indexOf("l") < temp.indexOf("r")) {
            if(temp.indexOf("l") < 0) {
                for(int i = temp.indexOf("r")+1; i < str_list.length; i++) { //Arrays.copyOfRange(배열,시작,끝);
                    list.add(str_list[i]);
                }
            }else {
                for(int i = 0; i < temp.indexOf("l"); i++) {
                    list.add(str_list[i]);
                }
            }
        }
        if(temp.indexOf("l") > temp.indexOf("r")) {
            if(temp.indexOf("r") < 0) {
                for(int i = 0; i < temp.indexOf("l"); i++) {
                    list.add(str_list[i]);
                }
            }else {
                for(int i = temp.indexOf("r")+1; i < str_list.length; i++) {
                    list.add(str_list[i]);
                }
            }
        }
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
	
	
	// 다른분 풀이
	/*
		String[] answer = {};
        for(int i=0;i<str_list.length;i++){
            if(str_list[i].equals("l")){
                answer = Arrays.copyOfRange(str_list,0,i);
                break;
            }else if(str_list[i].equals("r")){
                answer = Arrays.copyOfRange(str_list,i+1,str_list.length);
                break;
            }
        }
        return answer;
    */
}
