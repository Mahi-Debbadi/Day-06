public class ArrayDemo {
	public static void main(String[] args) {
		//Arrays
		//int a1,a2,3,a1..a1..a1..a1..a1000;
		int a[] = new int[5];
		for(int i=0,v=100;i<=4;i++) {
			a[i]=v;
			v=v+100;
		}
for(int i=0;i<=4;i++) {
	System.out.println(a[i]);
}
	}

}
