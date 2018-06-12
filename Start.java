package my.pack;

public class Start {
public static void main(String[] args) {
	String a="gautam";
	String b="gautam";
	String c=new String("gautam");
	String d=new String("gautam");
	StringBuffer s=new StringBuffer("gautam");
	String e=new String(s);
	if(d==e) {
		System.out.println("are equal");
	}else {
		System.out.println("not equal");
	}
	
}
}
