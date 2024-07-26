package Lv0.Retry;

/*
	< 코딩테스트 입문 : 구슬을 나누는 경우의 수 >

	머쓱이는 구슬을 친구들에게 나누어주려고 합니다.
	구슬은 모두 다르게 생겼습니다.
	머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
	
	제한사항)
	1 ≤ balls ≤ 30
	1 ≤ share ≤ 30
	구슬을 고르는 순서는 고려하지 않습니다.
	share ≤ balls
*/

public class Q40 {
	public int solution(int balls, int share) {
        int answer = 0;
        int[] temp = new int[balls-share];
		for(int i = share+1; i <= balls; i++) {
			temp[i-(share+1)] = i;
		}
		int[] temp2 = new int[balls-share];
		for(int i = 1; i <= balls-share; i++) {
			temp2[i-1] = i;
		}
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < temp2.length; j++) {
				if(temp[i] != 1 || temp2[j] != 1) {
					if(temp[i] % temp2[j] == 0) {
						temp[i] = temp[i] / temp2[j];
						temp2[j] = 1;
					}
				}
			}
		}
		
		long temp3 = 1;
		long temp4 = 1;
		for(int i = 0; i < temp.length; i++) {
			temp3 *= temp[i];
		}
		
		for(int i = 0; i < temp2.length; i++) {
			temp4 *= temp2[i];
		}
		answer = (int)(temp3 / temp4);
        return answer;
    }
	

	/*
		public int solution(int balls, int share) {
	        int answer = combination(balls, share);
	        return answer;
	    }
	    public static int combination(int n, int r) { //조합 풀이 공식
			if(n == r || r == 0) 
				return 1; 
			else 
				return combination(n - 1, r - 1) + combination(n - 1, r); nCr = n-1Cr-1 + n-1Cr (조합공식)
		}
    */
}
