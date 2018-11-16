import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Interview{
    public static String arrangeSentence(String text){
        String text1="";
       String[] arr=text.split(" ");
       Set<String> set=new HashSet<>();
       for (int i = 0; i < arr.length; i++) {
           set.add(arr[i]);
       }
       Iterator it=set.iterator();
       while(it.hasNext()){
         text1+=it.next()+" ";
       }
       return text1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        System.out.println(arrangeSentence(text));
    }
}