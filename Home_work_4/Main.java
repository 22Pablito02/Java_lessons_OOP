package Home_work_4;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        NotePad np = new NotePad();

        np.addTask(new YesterdayYet(LocalDate.of(2023, 02, 25), "Matting",
                "11:30", "2023 03 20", "Gin"));
        np.addTask(new MidleImportant(LocalDate.of(2023, 02, 25), "Visit Bos",
                "18:00", "2023 02 28", "Gin"));
        np.addTask(new NotImportant(LocalDate.of(2023, 03, 20), "Cinema",
                "8:00", "2023 03 20", "Gin"));
        np.addTask(new YesterdayYet(LocalDate.of(2023, 02, 25), "Matting",
                "20:30", "2023 03 20", "Gin"));
        System.out.println(np);
        System.out.println("--------------------------------------------------------");

        System.out.println("Задача среднего приоритета:");
        np.showMidlePriority();
        System.out.println("--------------------------------------------------------");

        System.out.println("Введите id записи для удаления");
        int id = input.nextInt();
        np.deleteTask(id);
        System.out.println("--------------------------------------------------------");
        System.out.println(np);
        System.out.println("--------------------------------------------------------");

        System.out.println("Какую по приоритету задачу нужно создать? Нажмите цифру\n1-высокую 2-среднюю 3-низкую");
        int chek = input.nextInt();

        np.addTaskFromUserByCheck(chek);

        ReadNotepad rd = new ReadNotepad();
        rd.readFile();
    }
}