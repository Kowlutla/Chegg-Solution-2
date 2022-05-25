import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OverrideValuesFromAnotherMap {

	public static void main(String[] args) {
		
		Map<String,String>destination=new HashMap<String,String>();
		destination.put("key11","Hai");
		destination.put("key12","how");
		destination.put("key13","you");
		destination.put("key23","xyz");
		destination.put("key14",".");
		
		Map<String,String>source=new HashMap<String,String>();
		source.put("key21","are");
		source.put("key12","Hello");
		source.put("key22","how");
		source.put("key23","friend");
		source.put("key24",".");
		source.put("key25","Hello");
		
		overrideExistingKeys(destination,source);
		System.out.println("The modified map is: "+destination);
		
	}

	//method to overrideExistingKeys in destinationMap 
	public static void overrideExistingKeys(Map<String, String> destination, Map<String, String> source) {
		
		//get the all keys in source Map
		Iterator<String>sourceIter=source.keySet().iterator();
		//Look for all keys in sourceMap
		while(sourceIter.hasNext())
		{
			//get the current key of sourceMap
			String currentKey=sourceIter.next();
			//if destinationMap contains the current key
			if(destination.containsKey(currentKey))
			{
				//replace the value in destination map
				destination.replace(currentKey, source.get(currentKey));
			}
		}
	}

}
