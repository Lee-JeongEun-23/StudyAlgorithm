package main;

import java.util.*;

public class TEST {

	public static void main(String[] args) {
		/*
		 	첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 
		 	두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
		 	
		 	0 <numer1, denom1, numer2, denom2 < 1,000
		 	
		 */
		int arr[] = new int[2];
		
		int numer1 = 2;
		int denom1 = 8;
		int numer2 = 2;
		int denom2 = 8;

		if(denom1 % numer1 == 0) {
			denom1 = denom1 / numer1;
			numer1 = 1;
		}
		if(denom2 % numer2 == 0) {
			denom2 = denom2 / numer2;
			numer2 = 1;
		}
	
		System.out.println(numer1);
		System.out.println(denom1);
		System.out.println(numer2);
		System.out.println(denom2);
		
		if(denom1 < denom2) {
			if(denom2 % denom1 == 0) {
				arr[1] = denom2;
				arr[0] = (denom2 / denom1) * numer1 + numer2;
			}else {
				arr[1] = (denom1 * denom2 / gcd(denom1, denom2));
				int a = 0, b = 0;
				a = (arr[1] / denom1) * numer1;
				b = (arr[1] / denom2) * numer2;
				arr[0] = a+b;
			}
		}else if(denom1 == denom2) {
			if((numer1+numer2) % denom1 == 0) {
				arr[0] = (numer1+numer2) / denom1;
				arr[1] = 1;
			}else {
				arr[0] = numer1+numer2;
				arr[1] = denom1;
			}
		}else {
			if(denom1 % denom2 == 0) {
				arr[1] = denom1;
				arr[0] = (denom1 / denom2) * numer2 + numer1;
			}else {
				arr[1] = (denom1 * denom2 / gcd(denom1, denom2));
				int a = 0, b = 0;
				a = (arr[1] / denom1) * numer1;
				b = (arr[1] / denom2) * numer2;
				arr[0] = a+b;
			}
		}
		if(arr[1] % arr[0] == 0) {
			arr[1] = arr[1] / arr[0];
			arr[0] = 1;
        }
		
System.out.println(Arrays.toString(arr));
		

	}
	
	static int gcd(int a, int b) {
		if (a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
	}

}
