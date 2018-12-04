import java.util.Map;
import java.util.TreeMap;

/* 
problem description
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  
*/

public class Order {
    public static String order(String words) {
      String sentence="";
      String word="";
      String[] arr=words.split(" ");
       int num=0;
       Map<Integer,String> map=new TreeMap<>();
      for(int i=0;i<arr.length;i++){
           char[] ch=arr[i].toCharArray();
           for (int j = 0; j < ch.length; j++) {
            if(Character.isDigit(ch[j])){
                num=(int)ch[j];
                map.put(num, arr[i]);
                } 
           }
        
          
      }
      for(Map.Entry<Integer,String> m:map.entrySet()){
          sentence+=m.getValue()+" ";
      }
      
        return sentence;
    }
    
    public static void main(String[] args){
      String words="is2 Thi1s T4est 3a";
      System.out.println(order(words));
    }
  }