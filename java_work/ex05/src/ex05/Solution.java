package ex05;

// ctr1 + 1 빠른 에러처리
// f2 파일 이름 변경

public class Solution {
	public static String soltion(String my_string, int k) {
		// i=o 부터 9까지 작동해라
		String result = "";
		for (int i = 0; i < k; i++) {
			result = result + my_string;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String my_string = "abcde";
		int num = 10;
		
		String temp = soltion(my_string, num);
		System.out.println(temp);
		
	}

}
