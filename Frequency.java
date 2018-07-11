import java.util.Scanner;

class Frequency{
    public static void countWordFrequency(String find){
     int count=0;
     Scanner scanner=new Scanner(System.in);
     String str=scanner.nextLine();
     String[] arr=str.split(" ");
     for (int i=0;i< arr.length;i++) {
       
            if(find.equals(arr[i])){
                count++;
                
            }
     
     }
     System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String find=sc.next();
        countWordFrequency(find);
      
        sc.close();
    }
}