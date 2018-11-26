import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AreSame{
    
    public static boolean checkArray(int[] a,int[] b){
        boolean result=false;
        int flag=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
              
             if( a[i]==Math.sqrt(b[j]) ){
                    result=true;
                    
                }
            
        }
           
           
        }
        return result;
    }
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //int size=sc.nextInt();
        int[] a=new int[]{121, 144, 19, 161, 19, 144, 19, 11} ; 
        int[] b =new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        
        boolean result=false;
        /*for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i]=sc.nextInt();
        }*/
        result=checkArray(a, b);
        System.out.println(result);
    }
}