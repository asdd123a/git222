package ex03;

public class ex07 {
	
	// 1byte -128 ~ +127

	public static void main(String[] args) {
		char aa = 'A';
		System.out.println(aa);
		int bb = (int)aa;
		System.out.println((int)bb);
		char cc = (char)bb;
		System.out.println(cc);
		
		byte kk = 127;
		System.out.println(kk+1);	//int형 연산...
		System.out.println((byte)(kk+1));	// 오버플로우 8bit
	}
}
