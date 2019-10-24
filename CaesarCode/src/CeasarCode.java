import java.util.Scanner;

public class CeasarCode {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in din text:");
		String text = input.next().toUpperCase();
		text = decipherString(text);
		System.out.println(text);
		
	}
	/**
	 * 
	 * 
	 * 
	 */
	public static String cipherString(String text) {
		String txt="";
		
		for(int i = 0; i<text.length(); i++) {
			char c = text.charAt(i);
			if(c >= 65 &&  c <= 87)
				txt += (char)(c + 3);
			else if(c == 88)
				txt += 'A';
			else if(c == 89)
				txt += 'B';
			else if(c == 90)
				txt += 'C';
		}
		return txt;
	}
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static String decipherString(String text) { 
		String txt="";
		for(int i = 0; i<text.length(); i++) {
			char c = text.charAt(i);
			if(c >= 68 &&  c <= 90)
				txt += (char)(c - 3);
			else if(c == 67)
				txt += 'Z';
			else if(c == 66)
				txt += 'Y';
			else if(c == 65)
				txt += 'X';
		}
		return txt;	
	}
		

}
//65 - 87