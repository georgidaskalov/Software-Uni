package OOP.WorkingWithAbstractionExerc.greedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cashcontainer {
    private Map<String,Long> cash;

    public Cashcontainer(){
        this.cash = new LinkedHashMap<>();
    }

    public long getValue(){
        return this.cash
                .values()
                .stream()
                .mapToLong(e -> e)
                .sum();
    }
}
