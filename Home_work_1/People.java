package Home_work_1;

import java.time.LocalDate;

public class People {

    int id;
    private String fName;
    String name;
    LocalDate birghtday;
    String sex;
    String status;
    public String fname;

    public People(int id, String fName, String name, LocalDate birghtday, String sex, String status) {
        this.id = id;
        this.fName = fName;
        this.name = name;
        this.birghtday = birghtday;
        this.sex = sex;
        this.status = status;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", fname='" + fName + '\'' +
                ", name='" + name + '\'' +
                ", lname='" + birghtday + '\'' +
                ", birghtday=" + sex +
                ", sex='" + status + '\'' +
                '}';
    }

}
