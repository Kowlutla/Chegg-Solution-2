import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String,String>map1=new LinkedHashMap<String,String>();
		map1.put("two","deux");
		map1.put("five","cinq");
		map1.put("one","un");
		map1.put("three","trois");
		map1.put("four","quatre");
		System.out.println("Map1: ");
		System.out.println(map1);
		mapMystery1(map1);
		
		System.out.println("Map2: ");
		Map<String,String>map2=new LinkedHashMap<String,String>();
		map2.put("skate", "board");
		map2.put("driver", "car");
		map2.put("program", "computer");
		map2.put("play", "computer");
		System.out.println(map2);
		mapMystery1(map2);
		
		System.out.println("Map3: ");
		Map<String,String>map3=new LinkedHashMap<String,String>();
		map3.put("siskel", "ebert");
		map3.put("girl", "boy");
		map3.put("heads", "tails");
		map3.put("ready", "begin");
		map3.put("first", "last");
		map3.put("begin", "end");
		System.out.println(map3);
		mapMystery1(map3);
		
		System.out.println("Map4: ");
		Map<String,String>map4=new LinkedHashMap<String,String>();
		map4.put("cotton", "shirt");
		map4.put("tree", "violin");
		map4.put("seed", "tree");
		map4.put("light", "tree");
		map4.put("rain", "cotton");
		System.out.println(map4);
		mapMystery1(map4);
		
	}

	
	public static void mapMystery1(Map<String,String>map)
	{
		Map<String,String>result=new TreeMap<String,String>();
		for(String key:map.keySet())
		{
			if(key.compareTo(map.get(key))<0)
			{
				result.put(key,map.get(key));
			}
			else
			{
				result.put(map.get(key), key);
			}
		}
		System.out.println(result);
	}
}
