package OOP.WorkingWithAbstractionExerc.greedyTimes;

public class Bag {
    private Cashcontainer cashcontainer;
    private Gold gold;
    private Gemcontainer gemContainer;

    private long capacity;

    public Bag(long capacity) {
        this.gold = new Gold();
        this.cashcontainer = new Cashcontainer();
        this.gemContainer = new Gemcontainer();
        this.capacity = capacity;
    }

    public boolean hasRoomFor(Long value) {
        return value + this.getCurrentSize() <= capacity;
    }

    private Long getCurrentSize() {
        long size = this.gold.getValue();
        size+= this.cashcontainer.getValue();
        size+= this.gemContainer.getSize();


        return size;
    }

    public void addGold(long value){
        this.gold.addValue(value);
    }

    public void addCash(long value){
        if (this.gold.getValue() >= this.cashcontainer.getValue() + value){

        }
    }

}
