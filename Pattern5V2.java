
public class Pattern5V2 {
	public static void main(String[] args) {
     /*
      * 1------1+1
      * 0 1----2+1
      * 1 0 1--3+1
      * 0 1 0 1---4+1
      */
		int v=0;
		for(int r=1;r<=4;r++) {
			for(int c=1;c<=r;c++) {
					if((r+c)%2==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
			}
		}
			System.out.println();
	}

}
}
