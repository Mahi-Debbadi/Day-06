
public class NoOfAlphabetsV1 {

	public static void main(String[] args) {
		String data = "sakshith";
		data = data.toLowerCase();
		// a-z----26
		int[] count = new int[26];
		for(int i=0;i<data.length();i++) {
			char ch = data.charAt(i);
			if(ch == 'a') {
				count[0]++;
			}
			else if(ch == 'b') {
				count[1]++;
		}
			else if(ch == 'c') {
				count[2]++;
	}
			else if(ch == 'd') {
				count[3]++;
}
			else if(ch == 'e') {
				count[4]++;
}
			else if(ch == 'f') {
				count[5]++;
			}
			else if(ch == 'g') {
				count[6]++;
			}
			else if(ch == 'h') {
				count[7]++;
			}
			else if(ch == 'i') {
				count[8]++;
			}
			else if(ch == 'j') {
				count[9]++;
			}
			else if(ch == 'k') {
				count[10]++;
			}
			else if(ch == 'l') {
				count[11]++;
			}
			else if(ch == 'm') {
				count[12]++;
			}
			else if(ch == 'n') {
				count[13]++;
			}
			else if(ch == 'o') {
				count[14]++;
			}
			else if(ch == 'p') {
				count[15]++;
			}
			else if(ch == 'q') {
				count[16]++;
			}
			else if(ch == 'r') {
				count[17]++;
			}
			else if(ch == 's') {
				count[18]++;
			}
			else if(ch == 't') {
				count[19]++;
			}
			else if(ch == 'u') {
				count[20]++;
			}
			else if(ch == 'v') {
				count[21]++;
			}
			else if(ch == 'w') {
				count[22]++;
			}
			else if(ch == 'x') {
				count[23]++;
			}
			else if(ch == 'y') {
				count[24]++;
			}
			else if(ch == 'z') {
				count[25]++;
			}
		} 
		for(int i=0;i<26;i++) {
			System.out.println((char)(i+97)+"---->"+count[i]);
		}
	}
}
		