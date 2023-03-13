package Home_work_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadNotepad {
    public void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("NotePad.csv"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
}
