package ex03;


class AA{
	public void doA() {
		System.out.println("doA");
	}
}

public class ex03 {
	public static void main(String[] args) {
		AA a2 = new AA();
		a2.doA();
		
		String a = new String("abcd");
		System.out.println(a.toUpperCase());
	}
}
