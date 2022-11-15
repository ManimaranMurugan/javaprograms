class TestString {
	static void printStringCharcter(String s) {
		for(int i=0; i<s.length(); i++)
			System.out.println("\t"+s.charAt(i));
		System.out.println();
	}
	static void non_RepeatedStringCharcter(String s) {
		 for(char i:s.toCharArray()) {
		if(s.indexOf(i) == s.lastIndexOf(i)) {
		System.out.println("First non-repeating character is: "+i);
            break;
			}
		}
	}
public static void main(String args[]) {
	String str="madam";
	printStringCharcter(str);
	non_RepeatedStringCharcter(str);
	System.out.println(str);
	
	}
}