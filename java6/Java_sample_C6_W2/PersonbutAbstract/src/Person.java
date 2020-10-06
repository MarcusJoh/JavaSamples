abstract class Person {

	private String name;
	private int age;

	public Person(String n, int a) {
		name = n;
		age = a;
	}

	public void hello() {
		System.out.println("name " + name + " age " + age);
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}


}