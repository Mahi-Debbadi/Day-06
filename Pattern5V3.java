
public class Pattern5V3 {

	public static void main(String[] args) {
		/*
		 *  1-----(1+1)-1 % 2----1
		 *  0 1---(2+1) -1 % 2----0
		 *  1 0 1--3+1
		 *  0 1 0 1----4+1
		 */
		int v=0;
		for(int r = 1;r<=4;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print( ((r+c)-1 )% 2+" ");
			}//c
			System.out.println();
		}
			}

}
