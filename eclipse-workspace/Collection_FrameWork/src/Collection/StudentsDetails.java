package Collection;

import java.util.Objects;

public class StudentsDetails {
	String name;
	int rollno;
	String branch;
	int marks;
	public StudentsDetails(String name, int rollno, String branch, int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.branch = branch;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "StudentsDetails [name=" + name + ", rollno=" + rollno + ", branch=" + branch + ", Marks="
				+ marks + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(branch, name, marks, rollno);
	}

	@Override 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentsDetails other = (StudentsDetails) obj;
		return Objects.equals(branch, other.branch) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& rollno == other.rollno;
	}
	
}
