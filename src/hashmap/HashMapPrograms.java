package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ExecuteHashMapPrograms {
	
	Map<Integer,String> firstmap = new HashMap<Integer, String>();
	Map<Integer,String> secondMap = new HashMap<Integer, String>();
	
	public void insertElement() {
		firstmap.put(3, "C");
		firstmap.put(2, "B");
		firstmap.put(1, "A");
		System.out.println("FirstMap Contains: " +firstmap);
		secondMap.put(6, "F");
		secondMap.put(5, "E");
		secondMap.put(4, "D");
		System.out.println("SecondMap Contains: " +secondMap);
	}
	
	public void retrieveElement() {
			
		if(firstmap.containsKey(2)) {
			System.out.println("Key: 2 " + "value: " + firstmap.get(2));
		}
		
		System.out.println("Using keySet");
		
		for (int key : firstmap.keySet()) {
			System.out.println("Key: " + key + " value: " + firstmap.get(key));
		}
		
		System.out.println("Using entrySet");
		
		for (Entry<Integer,String> entry : firstmap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue() );
		}
	}
	
	public void copyElement() {
		System.out.println("SecondMap Contains: " +secondMap);
		secondMap.putAll(firstmap);
		System.out.println("SecondMap Contains after Copy From FirstMap: " +secondMap);
	}
	
	public void swalloCopyElement() {
		HashMap<Integer,String> firstMap = new HashMap<Integer, String>();
		HashMap<Integer,String> swallowCopyMap = new HashMap<Integer, String>();
		firstMap.put(3, "C");
		firstMap.put(2, "B");
		firstMap.put(1, "A");
		System.out.println("FirstMap Contains: " +firstmap);
		System.out.println("After Swallow Copy ");
		swallowCopyMap = (HashMap) firstMap.clone();
		System.out.println("SecondMap Contains after Swallow Copy From FirstMap: " +swallowCopyMap);
	}
	
	public void mapToSet() {
		Set<Entry<Integer, String>> set = firstmap.entrySet();
		System.out.println("Map To Set: " + set);
		for (Entry<Integer, String> entry : set) {
			System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
		}
	}
	
}

public class HashMapPrograms {

	public static void main(String[] args) {
		ExecuteHashMapPrograms mapProgram = new ExecuteHashMapPrograms();
		mapProgram.insertElement();
		mapProgram.retrieveElement();
		mapProgram.copyElement();
		mapProgram.swalloCopyElement();
		mapProgram.mapToSet();
	}

}
