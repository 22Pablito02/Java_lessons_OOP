package Home_work_1;

import java.util.ArrayList;

public class Kin {

    public ArrayList<Unity> pairs = new ArrayList<>();

    public void setKin(People who, Relationship role, People whose) {
        pairs.add(new Unity(who, role, whose));

    }

    public void printPairs() {
        for (var el : pairs) {
            System.out.println(el.p1.fname + " " + el.p1.name + " " + el.r);
            System.out.println(el.p2.fname + " " + el.p2.name);
        }

    }

    public ArrayList<Unity> getPairs() {
        return pairs;
    }

}
