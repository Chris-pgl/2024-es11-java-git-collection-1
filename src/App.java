import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

    /**
     * TODO:
     * 
     * completare la classe DataHelper
     * 
     * aggiungere i seguenti metodi per testare la classe DataHelper:
     * - testRandomInteger : void
     * testare le 3 implementazioni del metodo getRandomInteger
     * 
     * - testRandomUniqueInteger : void
     * testare le 3 implementazioni del metodo getRandomUniqueInteger
     * 
     * - testFrequencyMap : void
     * testare il metodo getFrequencyMap;
     * sfruttare i metodi precedentemente svolti e utilizzarli come
     * dati in ingresso per il metodo getFrequencyMap
     * 
     */

    public static void main(String[] args) throws Exception {
        

        testRandomInteger();
        testRandomUniqueInteger();
        testFrequencyMap();
    }

    public static void testRandomInteger(){
        System.out.println("Test RandomInteger: ");
        List<Integer> list1 = DataHelper.getRandomInteger(10);
        System.out.println("Random list (0 - 10): " + list1);
        DataHelper.getRandomInteger(10,10);
        List<Integer> list2 = DataHelper.getRandomInteger(10, 20);
        System.out.println("Random list2 (0 - 20): " + list2);
        DataHelper.getRandomInteger(10,0,10);
        List<Integer> list3 = DataHelper.getRandomInteger(10, 5, 15);
        System.out.println("Random List3 (5 - 15): " + list3);
    }

    public static void testRandomUniqueInteger(){
        System.out.println("Test RandomUniqueInteger:");
        Set<Integer> set1 = DataHelper.getRandomUniqueInteger(10);
        System.out.println("Unique Random: (0 - 10): " + set1);
        Set<Integer> set2 = DataHelper.getRandomUniqueInteger(10,20);
        System.out.println("Unique Random: (0 - 20): " + set2);
        Set<Integer> set3 = DataHelper.getRandomUniqueInteger(10,5,15);
        System.out.println("Unique Random: (5 - 15): " + set3);

    }

    public static void testFrequencyMap(){
        System.out.println("Testin FrequencyMap:");
        List<Integer> ram1 = DataHelper.getRandomInteger(25, 5, 15);
        Map<Integer, Integer> f1 = DataHelper.getFrequencyMap(ram1);
        System.out.println("RandomList: " + ram1);
        System.out.println("FrequencyMap: " + f1);



    }
}
