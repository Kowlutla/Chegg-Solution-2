import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class UniqueValues {
	public static void main(String[] args) {
		// creating HashMap to Integer String as key and Values
		HashMap<Integer, String> a_map = new HashMap<Integer, String>();
		// Adding entry's to map
		a_map.put(0, "M");
		a_map.put(2, "M");
		a_map.put(3, "M");
		a_map.put(5, "M");
		a_map.put(6, "n");
		a_map.put(7, "M");
		a_map.put(9, "M");
		// printing input map
		System.out.println("Input: " + a_map);
		// printing output map which contain unique values of map by calling method
		// uniqueValues
		System.out.println("Output: " + uniqueValues(a_map));

		// removing all entry's from map to add new entry's for second test
		a_map.clear();
		// Adding entry's to map
		a_map.put(0, "A");
		a_map.put(1, "c");
		a_map.put(4, "c");
		a_map.put(5, "a");
		a_map.put(8, "Q");
		a_map.put(9, "c");

		// printing input map
		System.out.println("Input: " + a_map);
		// printing output map which contain unique values of map by calling method
		// uniqueValues
		System.out.println("Output: " + uniqueValues(a_map));
	}

	// Method search a_map to find all values that appear only once in a_map and
	// return new HashMap
	public static HashMap<String, Integer> uniqueValues(HashMap<Integer, String> a_map) {
		HashMap<String, Integer> count = new LinkedHashMap<String, Integer>();// Map to maintain count of each value in
																				// a_map
		// Look for each entry in a_map
		for (Entry<Integer, String> e : a_map.entrySet()) {
			// if count map already contain current value increment its occurrence value
			if (count.containsKey(e.getValue())) {
				int prev = count.get(e.getValue());
				count.put(e.getValue(), prev + 1);
			} else// if current value is not in count map add it with occurrence as 1
			{
				count.put(e.getValue(), 1);
			}
		}

		/*
		 * to hold the values which occurs only once in a_map
		 */
		ArrayList<String> list = new ArrayList<String>();

		// Look for all entry's in count map
		for (Entry<String, Integer> e : count.entrySet()) {
			if (e.getValue() == 1)// add values which occurs only once to the list
			{
				list.add(e.getKey());
			}
		}

		// create new HashMap to hold unique values of a_map in reverse order(Swap of
		// keys and values)
		HashMap<String, Integer> to_ret = new HashMap<String, Integer>();

		// Look for each entry in a_map
		for (Entry<Integer, String> e : a_map.entrySet()) {
			if (list.contains(e.getValue()))// if current entry value in list(which contain unique values of a_map)
			{
				to_ret.put(e.getValue(), e.getKey());// add these entry to to_ret map in reverse order
			}
		}
		return to_ret;// return the to_ret map
	}
}
