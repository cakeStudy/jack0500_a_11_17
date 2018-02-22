import java.util.HashMap;
import java.util.Map;

public class ch11_17a
{
    /*Write a method called subMap that accepts two maps from strings to strings as its parameters and returns true if
    every key in the first map is also contained in the second map and maps to the same value in the second map. For
    example, {Smith=949–0504, Marty=206–9024} is a submap of
   {Marty=206–9024, Hawking=123–4567,Smith=949–0504, Newton=123–4567}.
    The empty map is a submap of every map.*/

    public void run()
    {
        Map<String,String> map1 = new HashMap<>();
        map1.put("Smith","949-0504");
        map1.put("Marty","206-9024");
        //map1.put("Jake","101-202");

        Map<String,String> map2 = new HashMap<>();
        map2.put("Marty","206-9024");
        map2.put("Hawking","123-4567");
        map2.put("Smith","949-0504");
        map2.put("Newton","123-4567");

        System.out.println(subMap(map1,map2));
    }

    //checks if map1 is a sub-map  of map2
    public boolean subMap(Map<String,String> map1, Map<String,String> map2)
    {
        boolean subMap = true;

        //if map1 is empty, it´s a submap
        if (map1.isEmpty()==true)
        {
            return subMap;
        }
        //checks if map2 contains map1s keys and values, if not map1 is not a submap
        for (Map.Entry<String, String> m: map1.entrySet())
        {
            if (map2.containsKey(m.getKey()) != true || map2.containsValue(m.getValue()) != true)
            {
                subMap = false;
                return subMap;
            }
        }

        return subMap;
    }
}
