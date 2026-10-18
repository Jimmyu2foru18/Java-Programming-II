class Classroom {
	private static final int INITIAL_CAPACITY = 3;
	private int currentCapacity;
	private Student[] roster;
	private int count = 0;

	public Classroom() {
		currentCapacity = INITIAL_CAPACITY;
		roster = new Student[currentCapacity];
	}

	public void addStudent(Student sToAdd) {
		if (count == currentCapacity) {
			extendClassroom();
		}
		roster[count] = sToAdd;
		count++;
	}

	public void addStudent(String name, int id) {
		if (count == currentCapacity) {
			extendClassroom();
		}
		Student studentToAdd = new Student(name, id);
		addStudent(studentToAdd);
	}

	private void extendClassroom() {
		int newCapacity = currentCapacity * 2;
		Student[] newRoster = new Student[newCapacity];

		for (int i = 0; i < currentCapacity; i++) {
			newRoster[i] = roster[i];
		}

		currentCapacity = newCapacity;
		roster = newRoster;
	}

	public void printClassroom() {
		System.out.println("Class Roster:");
		for (int i = count - 1; i >= 0; i--) {
			Student student = roster[i];
			if (student != null) {
				System.out.println(student.toString());
			}
		}
	}
}