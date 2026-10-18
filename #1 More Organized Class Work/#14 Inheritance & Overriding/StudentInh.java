public class StudentInh {
	private String name;
	private int ID;

	public StudentInh(String name_i, int ID_i) {
		name = name_i;
		ID = ID_i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String toString() {
		return "Name: " + name + "\nID: " + ID;
	}

}
