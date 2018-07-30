import java.util.HashSet;
import java.util.Set;

public class Problem4_Match {
	public boolean doTheyMatch(Problem4_Person p1, Problem4_Person p2) {
		//Are they equal?
		System.out.println(p1.equals(p2));
		
		//If I add both to a Set does it enforce uniqueness?
		Set<Problem4_Person> setPerson = new HashSet<Problem4_Person>();
		setPerson.add(p1);
		setPerson.add(p2);
		System.out.println(setPerson.contains(p2));
		
		//If both conditions above are true, then return true, else false;
		return false;
	}
}
