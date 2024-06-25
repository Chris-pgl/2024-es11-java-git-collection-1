import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DataHelper {

    // TODO: completare i metodi seguenti

    // restituisce una lista di numeri interi casuali compresi tra 0 e 10
    public static List<Integer> getRandomInteger(int size) {
        return getRandomInteger(size,0,10);
    }

    // restituisce una lista di numeri interi casuali compresi tra 0 e max
    public static List<Integer> getRandomInteger(int size, int max) {
        return getRandomInteger(size,0, max);
    }

    // restituisce una lista di numeri interi casuali compresi tra min e max
    public static List<Integer> getRandomInteger(int size, int min, int max) {
        Random rmd = new Random();
        List<Integer> list = new java.util.ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(rmd.nextInt(max - min + 1) + min);
            }
            return list;
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e 10
     public static Set<Integer> getRandomUniqueInteger(int size) {
        return getRandomUniqueInteger(size,0,10);
     }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e max
     public static Set<Integer> getRandomUniqueInteger(int size, int max) {
        return getRandomUniqueInteger(size,0,max);
     }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra min e
    // max
     public static Set<Integer> getRandomUniqueInteger(int size, int min, int max) {
        Random rmd = new Random();
        Set<Integer> set = new java.util.HashSet<>();
        for (int i = 0; i < size; i++){
            int num = rmd.nextInt(max - min + 1) + min;
            while (set.contains(num)) {
                num = rmd.nextInt(max - min + 1) + min;
                }
                set.add(num);
        }
        return set;
    }

    // restituisce una mappa di frequenza di numeri interi
     public static Map<Integer, Integer> getFrequencyMap(List<Integer> list) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(Integer number : list){
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) +1);
        }
        return frequencyMap;
    }
}
