public class Program1 {
	 static void arRR(int[] x) {
		int len = x.length;// 5
		int arrLen = len - 1;// 4
		int t = x[arrLen];
		//num[4]=num[3]
		//num[3]=num[2]
		//num[2]=num[1]
		//num[1]=num[0]
		for(int i = arrLen;i>=1;i--) {
			x[i] = x[i-1];
		}
		x[0] = t;
		System.out.println("\n after 1 right Rotation \n");
		for(int i=0;i<=arrLen;i++) {
			System.out.print(x[i] + " ");
		}
	}
	 public static void main (String[] args) {
		 //right side rotation
		 //0 1 2 3 4
		 //45 55 65 75 85
		 //length ---5
		 //arrLen = len -1;
		 // 3---4
		 // 2---3
		 // 1---2
		 //0---1
		 //85 45 55 65 75
		 int[] num = {45,55,65,75,85};
		 System.out.println("Before right Rotation");
		 for(int i = 0; i<num.length;i++) {
			 System.out.print(num[i] + " ");
		 }
		 arRR(num);
		 arRR(num);
		 arRR(num);
	 }
	 }
