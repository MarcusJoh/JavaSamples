//arv
public class Employ extends Person {
	private int salary;

	public Employ(String n, int a, int s) {
		// super pekar på första arvet uppåt
		super(n, a);
		setSalary(s);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void hello() {
	    super.hello();
	    System.out.println("pay "+ salary);
	}

}