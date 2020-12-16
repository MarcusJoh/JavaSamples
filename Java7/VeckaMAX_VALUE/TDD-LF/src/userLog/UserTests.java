package userLog;

public class UserTests {

	private String fName;

	private String lName;

	private int id;


	public void clear() {
		this.fName = null;
		this.lName = null;
		this.id = 0;

	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean checkfName() {
		return this.fName == UserData.validFName;
	}

	public boolean checklName() {
		return this.lName == UserData.validlName;
	}

	public boolean checkId() {

		return this.id == UserData.validid;
	}

}
