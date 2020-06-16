package main.java.com.globant.rappi.test.test2;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Level {
    Map<Integer, Integer> config = new TreeMap<>(Collections.reverseOrder());

    public Level() {
        this.config.put(1,15);
        this.config.put(2,10);
        this.config.put(3,5);
        this.config.put(4,0);
    }

    public List<Integer> checkLevel(int tag, int iteration){
        return this.config.entrySet().stream().filter(
                i -> iteration >= i.getValue()).map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
