
public class Problem3_Collections {
	public void collectionFun() {
		Map<Integer,Integer> tempMap = new HashMap<Integer,Integer>();		
		Set<Integer> tempSet = new HashSet<Integer>();
		List<Integer> finalList = new ArrayList<Integer>();
		for(int i=1;i<=100;i++){
		     tempMap.put(i,i);
		}
		tempSet.addAll(tempMap.values());
		finalList.addAll(tempSet);
		Collections.sort(finalList);
		
		for(Integer finalVal: finalList) {
			System.out.println(finalVal);
		}
		//tempSet.addAll(
		
		//Requirements: Generate 100 random numbers between 1-1000.
		//	Put the numbers into a Map.  Then move them to a Set.
		//  Then move the numbers into a List.  Then sort the numbers.
		//	Finally output the numbers, with one number on every row
		
		
		
		
	}
}
