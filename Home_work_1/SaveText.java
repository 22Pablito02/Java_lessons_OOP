package Home_work_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class SaveText {

    public void savePairs(Kin k) {

        try (FileWriter fw = new FileWriter("file.txt", false)) {

            for (Unity el : k.getPairs()) {
                fw.write(el.toString());
                fw.append('\n');
            }
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void saveFamilyTree(ArrayList<ArrayList<Unity>> family) {

        try (FileWriter fw = new FileWriter("fileFamilyTree.txt", false)) {

            for (ArrayList el : family) {
                fw.write(el.toString());
                fw.append('\n');
                fw.append("************************************");
                fw.append('\n');
            }
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}