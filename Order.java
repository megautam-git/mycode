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
      for(int i=0;i<arr.length;i++){
           char[] ch=arr[i].toCharArray();
           if(Character.isDigit(ch[i])){
            num=ch[i];
            for(int j=0;j<ch.length;j++){
                if( num>ch[i]){
                    num=ch[j];
                }
                word+=ch[j];
            }
              
               
            
           }
          
           sentence+=word;
      }
      
        return sentence;
    }
    
    public static void main(String[] args){
      String words="is2 Thi1s T4est 3a";
      System.out.println(order(words));
    }
  }