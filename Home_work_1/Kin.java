package Home_work_1;

import java.util.ArrayList;
import java.util.List;

public class Kin {
    private List<Unity> pairs = new ArrayList<>();
    private List<List<Unity>> kin = new ArrayList<>();


    public Kin(ArrayList<Unity> pairs) {
        this.pairs = pairs;

    }

    public Kin() {
        this(new ArrayList<>());

    }

    public void setKin(People who, Relationship role, People whose) {
        this.pairs.add(new Unity(who, role, whose));
        this.kin.add(pairs);
    }

    public List<Unity> getPairs() {
        return pairs;
    }

    public List<List<Unity>> getKin() {
        return kin;
    }

    @Override
    public String toString() {
        return "Kin{" +
                "pairs=" + pairs +
                '}';
    }

}
