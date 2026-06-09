import java.util.*;


public class MainMapsCollection {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Berlin",30000000);
        map.put("Dresden",750000);
        map.put("Hamburg",1800000);
        map.put("Köln",1000000);
        System.out.println("LinkedHashMap");
        printCitiesMap(map);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Berlin",30000000);
        map2.put("Dresden",750000);
        map2.put("Hamburg",1800000);
        map2.put("Köln",1000000);
        System.out.println("HashMap");
        printCitiesMap(map2);

        TreeMap<String, Integer> map3 = new TreeMap<>();
        map3.put("Berlin",30000000);
        map3.put("Dresden",750000);
        map3.put("Hamburg",1800000);
        map3.put("Köln",1000000);
        System.out.println("TreeMap");
        printCitiesMap(map3);


    }
    public static void printCitiesMap(Map<String,Integer> map){
        Set<String> keySet = map.keySet();
        for(String key:keySet){
            System.out.print(key+": ");
            int value = map.get(key);
            System.out.println(" =>  "+value);

        }
            System.out.println("+++-*-*-*-+");

        }



//      Делает то же самое только меньше строчек кода )
//     public static void printCitiesMap(Map<String,Integer> map){
//      for(String key:map.keySet()){
//        System.out.println(key+": "+map.get(key));
//               }
//     System.out.println("+++-*-*-*-+");
//
//     }
}







