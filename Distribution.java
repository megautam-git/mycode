package my.pack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Distribution {
public static void main(String[] args) {
	Student s=new Student();
	List<Student> list=new ArrayList<>();
	list.add(new Student("gautam","etc",60000.0));
	list.add(new Student("harish","cse",80000.0));
	double total=0;
	List<String> list1=new ArrayList<>();
	list1.add("audi");
	list1.add("bmw");
	list1.add("tata");
	list1.add("jaguar");
	
	List<List<String>>li=new ArrayList<>();
	
	li.add(list1);
	System.out.println(li);
	Iterator it=list.iterator();
	while (it.hasNext()) {
Student st=(Student) it.next();

//double m=st.getFees();
total+=st.getFees();
System.out.println("name"+st.getName()+"branch:"+st.getBranch()+"fees"+st.getFees());

		
	}
	Student s1=new Student();
	
	System.out.println("total:"+total);
}
}
