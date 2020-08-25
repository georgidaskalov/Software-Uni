package advanced.christmas;


import java.util.ArrayList;

public class Bag{
    private String color;
    private int capacity;
    private ArrayList<Present> data;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int count() {
        return data.size();
    }

    public void add(Present present) {
        if (this.capacity > this.data.size()) {
            this.data.add(present);
        }
    }

    public boolean remove(String name) {
        int index = -1;
        for (int i = 0; i < data.size(); i++) {
            if (this.data.get(i).toString().equals(name)) {
                index = i;
            }
        }
        if (index != -1) {
            this.data.remove(index);
            return true;
        }
        return false;
    }

    public Present heaviestPresent() {
        double heaviest = 0.0;
        int index = -1;

        for (int i = 0; i < data.size(); i++) {
            double presentWeight = data.get(i).getWeight();
            if (heaviest < presentWeight) {
                heaviest = presentWeight;
                index = i;
            }
        }
        return data.get(index);
    }

    public Present getPresent(String name) {

        for (int i = 0; i < data.size(); i++) {
            double presentWeight = data.get(i).getWeight();
            if (data.get(i).getName().equals(name)) {
                return data.get(i);
            }
        }
        return null;
    }

    public String report() {
        StringBuilder stringBuilder = new StringBuilder(String.format("%s bag contains: %n", this.color));


        for (int i = 0; i < data.size(); i++) {
            stringBuilder.append(data.get(i)).append(System.lineSeparator());
        }
        return stringBuilder.toString().trim();
    }

}

