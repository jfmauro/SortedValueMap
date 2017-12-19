
public class PersonPairByEmail extends Pair<Long, Person>{

	public PersonPairByEmail(Long key, Person value) {
		super(key, value);		
	}

	@Override
	public int compareTo(IPair<Long, Person> o) {		
		return this.getValue().getEmail().compareTo(o.getValue().getEmail());
	}

}
