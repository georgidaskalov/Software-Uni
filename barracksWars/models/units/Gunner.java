package barracksWars.models.units;

public class Gunner extends AbstractUnit {
    private static int GUNNER_HEALTH = 20;
    private static int GUNNER_DAMAGE = 10;


    public Gunner() {
        super(GUNNER_HEALTH,GUNNER_DAMAGE);
    }
}
