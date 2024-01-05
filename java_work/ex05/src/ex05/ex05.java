package ex05;

public class ex05 {
	
	public static void main(String[] args) {
		
		int a = 10;
		// a = 1010
		// a >> 2 비트가 두칸 가게되면..
		// 1010 & 0010
		
		System.out.printf("%x\n", a);
		System.out.printf("%d\n", a>>2);
		System.out.printf("%d\n", a>>2 & a);
	}

}
