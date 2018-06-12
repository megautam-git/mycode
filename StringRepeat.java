package my.pack;

public class StringRepeat {
	public static void mumbleWord(String str) {
		String sum="";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <=i; j++) {
				char ch=str.charAt(i);
				if(str.indexOf(i)==0) {
				sum+=Character.toUpperCase(ch);	
				}else {
					sum+=ch;
				}
			}
			
		}
		System.out.println(sum);
	}
	public static String convertWord(String str) {
		String[] st=str.split("\\s");
		String sum="";
		
		for (int i = 0; i<st.length; i++) {
			int n=1;
			String first=st[i].substring(0,n );
			String second=st[i].substring(n);
			sum+=first.toUpperCase()+second+" ";
		}
		return sum;
	}
public static void main(String[] args) {
	String val="gautam";
	mumbleWord(val);
	String sentence="this is a cat";
	System.out.println(convertWord(sentence));
}
}
