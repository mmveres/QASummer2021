package ua.univer.lesson11;

import java.util.HashMap;
import java.util.Map;

public class ProgramMap {
    public static void main(String[] args) {
        String str = "mama mila ramu ramu mila mama ramu";
        Map<String, Integer> fregMap = new HashMap<>();
        String [] words = str.split(" ");
        for (var word: words) {
            if (!fregMap.containsKey(word))
                fregMap.put(word, 1);
            else
                fregMap.put(word, fregMap.get(word)+1);
        }
        System.out.println(fregMap);
    }
}
