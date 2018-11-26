import java.util.Arrays;
import java.util.Scanner;

public class Reverse{
    public static int findReverse(int num){
        
        String reverse="";
        String n= Integer.toString(num);
         char[] arr=n.toCharArray();
         Arrays.sort(arr);
        
         
         for (int i = arr.length-1; i >=0; i--) {
             reverse+=arr[i];
             
         }
         int digit=Integer.valueOf(reverse);
         return digit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(findReverse(num));
        sc.close();
    }
}