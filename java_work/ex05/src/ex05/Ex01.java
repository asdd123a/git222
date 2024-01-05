package ex05;

import java.util.Scanner;
/*
 * 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 만드세요
 */
class A{
	public void doA() {
		
	}
}



public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//입력 받는거
		int n = scan.nextInt();
		String result = n % 2 == 0 ? n+"n is even" : n+"n is odd";
		System.out.println(result);

	}

}
