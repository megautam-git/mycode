package mycode;

public class NumberCount {
public  void count(int[] arr) {
	int count=0;
	int i,j;
	for ( i = 0; i < arr.length; i++) {
		//
		int m=arr[i];
		for (j = 0; j <arr.length; j++) {
			//int n=arr[j];
			if(arr[j]==m) 
				
				count++;
				System.out.println("occurance of"+arr[i]+" "+count+"times");
			
			
		}
		
	}

}
public  boolean compareArray(int[] a,int[] b) {
	for (int i = 0; i < b.length ||i<a.length; i++) {
		if (b[i]==Math.sqrt(a[i])) {
			return true;
		}else {
			return false;
		}
	}
	return false;
}
//removing duplicate character
public static void removeDuplicate(String str) {
	String sum="";
	for (int i = 0; i <= str.length()-2; i++) {
		if(str.charAt(i)==str.charAt(i+1)) {
			sum+=str.substring(i,i+1);
		}
	}
	System.out.println(sum);
}
	public static void main(String[] args) {
		NumberCount number=new NumberCount();
    int[] arr= {13,2,4,2,5,13,2,1,4,3};
		number.count(arr);		
		int[] a= {121,361,49,11,7,19};
		int[] b= {11,7,19};
		System.out.println(number.compareArray(a, b));	
		String str="ghhbjkjlkkkkmm";
		removeDuplicate(str);
	}
}
