package Collection;

public class StudentsExam implements Comparable<StudentsExam>{
	String name;
	int id;
	int marks;
	int rank;
	public StudentsExam(String name, int id, int marks) {
		super();
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "StudentsExam [name=" + name + ", id=" + id + ", marks=" + marks + ", rank=" + rank + "]\n";
	}
	
//	@Override
//	public int compareTo(StudentsExam o) {
//		if(this.marks>o.marks) {
//			return -1;
//		} 
//		else if(this.marks<o.marks) {
//			return 1;
//		}
//		return 0;
//	}
	
	@Override
	public int compareTo(StudentsExam o) {
		return o.marks-this.marks;		//Descending order
//		return this.marks-o.marks; 		//Ascending order
	}
	
	
}
