package set;

public class Student implements Comparable<Student>{
	String name;
	int id;
	int marks;
	public Student(String name, int id, int marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]\n";
	}
	public int compareTo(Student s1) {
		if(this.marks>s1.marks) 
			return 1;
		else if(this.marks<s1.marks)
			return -1;

		return 0;
	}
	
}
