package Home_work_1;

public class Unity {

    People p1;
    Relationship r;
    People p2;

    public Unity(People p1, Relationship r, People p2) {
        this.p1 = p1;
        this.r = r;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s \n", p1.getFname(), p1.getName(), r, p2.getFname(), p2.getName());
    }
}


