
public class SwapingNos {

	public static void main(String[] args) {
		int a=100,b=200;
		System.out.println("Before swapping.....");
		System.out.println("a--->"+a);
		System.out.println("b--->"+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping....");
		System.out.println("a--->"+a);
		System.out.println("b--->"+b);
		
	}

}
