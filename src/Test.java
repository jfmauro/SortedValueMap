import java.util.List;


public class Test {
	
	public static void main(String[] args) {
		Person p1 = new Person (1l, "doe@gmail.com", 47);
		Person p2 = new Person (2L, "andre@gmail.com", 21);
		Person p3 = new Person (3L, "zanetti@gmail.com", 34);
		
		SortedMap<Long, Person> s = new SortedMap<Long, Person>(new PersonPairFactory());
		
		s.put(p1.getId(), p1);
		s.put(p2.getId(), p2);
		s.put(p3.getId(), p3);
		
		List<IPair<Long, Person>> sortByValue = s.sortByValue();
		
		for (IPair<Long, Person> i : sortByValue){
			System.out.println(i.getValue().getEmail());
		}
	}

}
