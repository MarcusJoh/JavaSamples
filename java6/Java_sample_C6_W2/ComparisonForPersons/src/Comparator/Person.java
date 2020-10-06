package Comparator;

class Person implements Comparable<Person> {

	String fname;
	String lname;

	public Person(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;

	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}



	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.getFname().compareTo(o.getFname());
	}


}