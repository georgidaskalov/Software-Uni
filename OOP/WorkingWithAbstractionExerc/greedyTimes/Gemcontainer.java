package OOP.WorkingWithAbstractionExerc.greedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Gemcontainer {
    private Map<String, Long> gems;

    public Gemcontainer(){
        this.gems = new LinkedHashMap<>();
    }

    public long getSize(){
        return this.gems
                .values()
                .stream()
                .mapToLong(e -> e)
                .sum();
    }
}
