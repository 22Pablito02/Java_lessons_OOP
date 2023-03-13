package Home_work_3;

import java.io.*;
import java.time.LocalDate;
import java.util.*;


public class Main implements Serializable {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {

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

Kinship k1 = new Kinship();
Kinship k2 = new Kinship();

k1.setKinship(p1, Relationship.HUSBAND, p2);
k2.setKinship(p2, Relationship.WIFE, p1);

People p3 = CreatePeople.getInstance()
        .setId()
        .setFname("Бабкина")
        .setName("Зоя")
        .setBirghtday(LocalDate.of(2010, 8, 8))
        .setSex("Ж")
        .setStatus("дочь")
        .create();

Kinship k3 = new Kinship();
k3.setKinship(p1, Relationship.FATHER, p3);
k3.setKinship(p2, Relationship.MOTHER, p3);
k1.setKinship(p3, Relationship.DAUGHTER, p1);
k2.setKinship(p3, Relationship.DAUGHTER, p2);

People p4 = CreatePeople.getInstance()
        .setId()
        .setFname("Бабкин")
        .setName("Алексей")
        .setBirghtday(LocalDate.of(2018, 02, 15))
        .setSex("м")
        .setStatus("сын")
        .create();

Kinship k4 = new Kinship();
k4.setKinship(p1, Relationship.FATHER, p4);
k4.setKinship(p2, Relationship.MOTHER, p4);
k1.setKinship(p4, Relationship.SON, p1);
k2.setKinship(p4, Relationship.SON, p2);
k3.setKinship(p3, Relationship.SISTER, p4);
k4.setKinship(p4, Relationship.BROTHER, p3);
k3.setKinship(p3, Relationship.BROTHER, p4);

pr.setFamily(k1.getPairs());
pr.setFamily(k2.getPairs());
pr.setFamily(k3.getPairs());
pr.setFamily(k4.getPairs());


        System.out.println("Хотите добавить нового члена семьи? Если да, нажмите 1");
        int step = input.nextInt();
        if (step == 1) {
            People newPeople = new People();
            newPeople = pr.addInfoAboutNewPeople();
            pr.setNewKinship(newPeople);

            System.out.println("----------------------------------------");
            
            pr.getTreeByOnePeople();
        } else System.out.println("Всего доброго!");

        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ;
        oos.writeObject(pr);
        oos.flush();
        oos.close();

        PeopleRepository prExport = new PeopleRepository();
        FileInputStream fis = new FileInputStream("temp.out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        prExport = (PeopleRepository) oin.readObject();
        prExport.getAllTree();

    }
}