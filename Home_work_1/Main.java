package Home_work_1;

import java.time.LocalDate;
import java.util.*;

public class Main {

        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {

                ArrayList<ArrayList<Unity>> family = new ArrayList<>();

                People p1 = CreatePeople.getInstance()
                                .setId()
                                .setFname("Бабкин")
                                .setName("Даниил")
                                .setBirghtday(LocalDate.of(1990, 02, 21))
                                .setSex("м")
                                .setStatus("отец")
                                .create();

                People p2 = CreatePeople.getInstance()
                                .setId()
                                .setFname("Бабкина")
                                .setName("Полина")
                                .setBirghtday(LocalDate.of(1995, 02, 20))
                                .setSex("ж")
                                .setStatus("мать")
                                .create();

                Kin k1 = new Kin();
                Kin k2 = new Kin();

                k1.setKin(p1, Relationship.husband, p2);
                k2.setKin(p2, Relationship.wife, p1);

                People p3 = CreatePeople.getInstance()
                                .setId()
                                .setFname("Бабкина")
                                .setName("Зоя")
                                .setBirghtday(LocalDate.of(2010, 8, 8))
                                .setSex("Ж")
                                .setStatus("дочь")
                                .create();

                Kin k3 = new Kin();
                k3.setKin(p1, Relationship.father, p3);
                k3.setKin(p2, Relationship.mother, p3);
                k1.setKin(p3, Relationship.daughter, p1);
                k2.setKin(p3, Relationship.daughter, p2);

                People p4 = CreatePeople.getInstance()
                                .setId()
                                .setFname("Бабкин")
                                .setName("Алексей")
                                .setBirghtday(LocalDate.of(2018, 02, 15))
                                .setSex("м")
                                .setStatus("сын")
                                .create();

                Kin k4 = new Kin();
                k4.setKin(p1, Relationship.father, p4);
                k4.setKin(p2, Relationship.mother, p4);
                k1.setKin(p4, Relationship.son, p1);
                k2.setKin(p4, Relationship.son, p2);
                k3.setKin(p3, Relationship.sister, p4);
                k4.setKin(p4, Relationship.brother, p3);

                family.add(k1.pairs);
                family.add(k2.pairs);
                family.add(k3.pairs);
                family.add(k4.pairs);

                System.out.println(family);
        }

}
