
public class PersonPairFactory implements PairFactory<Long, Person, PersonPairByEmail>{

	@Override
	public PersonPairByEmail create(Long key, Person value) {		
		return new PersonPairByEmail(key, value);
	}
	
}
