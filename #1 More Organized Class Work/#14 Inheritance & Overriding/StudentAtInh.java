
public class StudentAtInh extends StudentInh {
	private String sportPlayed;

	public StudentAtInh(String name_i, int ID_i, String sportPlayed_i) {
		super(name_i, ID_i);
		setsportPlayed(sportPlayed_i);
	}

	public String getsportPlayed() {
		return sportPlayed;
	}

	public void setsportPlayed(String sportPlayed_i) {
		this.sportPlayed = sportPlayed_i;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSport Played: " + sportPlayed;
	}
}
