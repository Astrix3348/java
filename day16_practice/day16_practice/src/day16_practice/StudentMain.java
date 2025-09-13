package day16_practice;

public class StudentMain {
	public static void main(String[] args) {
		Methods m = new Methods();
		Student[] stu = new Student[10];
		m.accept(stu);
		m.display(stu);
		m.findResult(stu);
		
	}

}
