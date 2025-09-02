package day8;

public class Final {
	
	public static void main(String[] args) {
		Address add = new Address("Delhi", "New Delhi", 110078, 998866l);
		Employee e = new Employee(1, "Aakash", "SDE", add);
		
		e.displayEmployee();
	}

}
