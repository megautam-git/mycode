package mycode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Management {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	List<Student> list=new ArrayList<>();
	for (int i = 0; i <2; i++) {
		Student student=new Student();
		student.setName(sc.next());
		student.setBranch(sc.next());
		student.setFees(sc.nextDouble());
		list.add(student);
	}

	
	Iterator it=list.iterator();
	while(it.hasNext()){
		Student st=(Student)it.next();
		System.out.println(st.getName()+" "+st.getBranch()+" "+st.getFees());
	}
}
}
