package Collections;
import java.util.*;
public class ProblemsOnMap {
    public static void frequencyOfElementsInArray(ArrayList<Integer>arr){
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int num : arr){
            map1.put(num, map1.getOrDefault(num, 0) + 1);
//            if(!map1.containsKey(num)){
//                map1.put(num, 1);
//            } else{
//                map1.put(num, map1.get(num) + 1);
//            }
        }
        System.out.println(map1);
        // I need to print the output like Array consists of arrays like [[],[],[]]
        ArrayList <ArrayList<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entries : map1.entrySet()){
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(entries.getKey());
            pair.add(entries.getValue());
            result.add(pair);
        }
        System.out.println(result);

//        result.sort(Comparator.comparingInt(a -> a.get(0)));
//        System.out.println(result);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,1,2,2,2,3,5,6,6));
        frequencyOfElementsInArray(arr1);
    }
}
