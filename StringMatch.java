package my.pack;

public class StringMatch {
public static void main(String[] args) {
	String s="this is gautam";
	String s1="gautam lives in banglore";
	int count=0;
	int i,j;
	for ( i = 0; i < s.length(); i++) {
	   for ( j = 0; j < s1.length(); j++) {
		if(s1.charAt(j)==s.charAt(i)) {
			count++;
			System.out.println(s.charAt(i)+""+count);
		}
		
	}
	}
}
}
