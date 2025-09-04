package day10;

public interface TestInterface {
	
	public void connect();

}

class Oracle implements TestInterface{

	@Override
	public void connect() {
		System.out.println("Connecting Java with Oracle");
		
	}
	
}

class MySQL implements TestInterface{
	@Override
	public void connect() {
		System.out.println("Connecting java with SQL");
	}
	
}
