package Home_work_1;

import java.time.LocalDate;
import java.util.*;

public class Main {

        public static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {

                PeopleRepository pr = new PeopleRepository();

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

                k1.setKin(p1, Relationship.HUSBAND, p2);
                k2.setKin(p2, Relationship.WIFE, p1);

                People p3 = CreatePeople.getInstance()
                                .setId()
                                .setFname("Бабкина")
                                .setName("Зоя")
                                .setBirghtday(LocalDate.of(2010, 8, 8))
                                .setSex("Ж")
                                .setStatus("дочь")
                                .create();
    
                Kin k3 = new Kin();
                k3.setKin(p1, Relationship.FATHER, p3);
                k3.setKin(p2, Relationship.MOTHER, p3);
                k1.setKin(p3, Relationship.DAUGHTER, p1);
                k2.setKin(p3, Relationship.DAUGHTER, p2);

                People p4 = CreatePeople.getInstance()
                                .setId()
                                .setFname("Бабкин")
                                .setName("Алексей")
                                .setBirghtday(LocalDate.of(2018, 02, 15))
                                .setSex("м")
                                .setStatus("сын")
                                .create();

                Kin k4 = new Kin();
                k4.setKin(p1, Relationship.FATHER, p4);
                k4.setKin(p2, Relationship.MOTHER, p4);
                k1.setKin(p4, Relationship.SON, p1);
                k2.setKin(p4, Relationship.SON, p2);
                k3.setKin(p3, Relationship.SISTER, p4);
                k4.setKin(p4, Relationship.BROTHER, p3);
                k3.setKin(p3, Relationship.BROTHER, p4);

                pr.setFamily(k1.getPairs());
                pr.setFamily(k2.getPairs());
                pr.setFamily(k3.getPairs());
                pr.setFamily(k4.getPairs());

<<<<<<< HEAD
                System.out.println(pr);
                // pr.getAllTree();
                // pr.getTreeByOnePeople();
=======
                // System.out.println(pr);
                pr.getAllTree();
                pr.getTreeByOnePeople();
>>>>>>> 1283c4674ed1dd14b606f1f5c688bb7179f7e420
        }
}