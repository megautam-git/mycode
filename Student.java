package my.pack;

public class Student {
private String name;
private String branch;
private double fees;
Student() {
	//super();
}
public Student(String name, String branch,double fees) {
	super();
	this.name = name;
	this.branch = branch;
	this.fees=fees;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}


}
