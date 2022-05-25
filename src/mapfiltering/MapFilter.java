package mapfiltering;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapFilter {

	/**
	 * Takes a provided TreeMap, removes entries where the (i) key is a multiple of
	 * keyFilter AND (ii) the value contains the valueFilter character, then returns
	 * the resulting TreeMap. If applying the key and value filters does not remove
	 * any entries, then the provided map must be returned.
	 * 
	 * @param keyFilter   filter to be applied to the map entry keys. Must not be 0.
	 * @param valueFilter filter to be applied to the map entry values
	 * @return resulting map when filters are applied to provided map
	 */
	public static TreeMap<Integer, String> filterTreeMap(TreeMap<Integer, String> map, int keyFilter,
			char valueFilter) {
		
		//iterator to iterate through all key in map
		Iterator<Integer>iter=map.keySet().iterator();
		//for all keys
		while(iter.hasNext())
		{
			//get the current key
			int key=iter.next();
			//get corresponding value to key
			String value=map.get(key);
			//(i)key is a multiple of keyFilter AND 
			//(ii) the value contains the valueFilter character
			//Note: indexOf Method returns index of character in string if present
			//if not present returns -1
			if(key%keyFilter==0 && value.indexOf(valueFilter)!=-1)
			{
				//removes current entry 
				iter.remove();
			}
		
		}
		// returns the resulting TreeMap
		return map;
	}
}