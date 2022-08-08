package Task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Map;

class WordCount {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("./src/main/resources/Demo.txt")));

        Map<String, Integer> sortedMap = new TreeMap<>();
        String[] words = content.toLowerCase().split("[\\W]+");
        /**Условный оператор можно заменить на sortedMap.merge(word, 1, Integer::sum) по подсказке IDE, но так нагляднее;**/
        for (String word : words) {
            Integer occurence = sortedMap.get(word);
            if (occurence == null)
                sortedMap.put(word, 1);
            else {
                sortedMap.put(word, occurence + 1);
            }
        }
        System.out.println(sortedMap);

        int maxValue = (Collections.max(sortedMap.values()));
        String maxKey = Collections.max(sortedMap.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.print("\nСамое частое слово: "+ maxKey + " - " + maxValue);
        }
    }