package ex04;

import java.util.Scanner;

class AA {
}

/*
 * 문자열 str이 주어집니다. 문자열을 시계 방향으로 93도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해보세요.
 *
 */

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		char[] chars = a.toCharArray();
		
		System.out.println("Chars[0] = "+chars[0]);
		System.out.println("Chars[1] = "+chars[1]);
		System.out.println("Chars[2] = "+chars[2]);
		
		for(int i = 0; i< chars.length; i++)
			System.out.println(chars[i]);
			
	}

}
