import java.util.*;
import java.util.function.Consumer;

public class WordHistogram {
    HashMap<String, Integer> map = new HashMap<>();

    public void analyseString(String toAnalyse) {
        //converter string em array separado
        String [] array = toAnalyse.toLowerCase().split(" ");

        //converter array para list
        List<String> list = Arrays.asList(array);

        //atribuir chave-valor
        for (String element : list) {
            map.put(element, map.getOrDefault(element,0) + 1);
        }
        System.out.println(map);
    }

    public Integer get (String word) {
        return map.get(word);
    }

}
