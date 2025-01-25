
public class SubStringDemo {

	public static void main(String[] args) {
		String name1 = "Abhi";
		String name2 = "Mahi";
		System.out.println("Before swapping");
		System.out.println("name1-------"+name1);
		System.out.println("name2-------"+name2);
		name1 = name1 + name2; // AbhiMahi
		name2 = name1.substring(0,name1.length()-name2.length()); //Abhi
		name1 = name1.substring(name2.length());
		System.out.println("After Swapping");
		System.out.println("name1----"+name1);
		System.out.println("name2----"+name2);
	}

}
