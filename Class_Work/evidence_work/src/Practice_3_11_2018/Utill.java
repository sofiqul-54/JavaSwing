package Practice_3_11_2018;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Utill {

    public static void writeToFile(String filename, List<Student> students) throws Exception {
        File destFile = new File(filename + ".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("We had to make a new file");
                destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Student s : students) {
                out.append(s.getId() + "," + s.getName() + "," + s.getPass() + ","
                        + s.getEmail() + "," + s.getAge() + "," + s.getGender() + ","
                        + s.getHobby() + "," + s.getRound() + "," + s.getMessage());
            }
            out.close();
        } catch (Exception e) {
        }
    }
    
    public static  void readToFile(String filename, DefaultTableModel model){
    String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename+ ".txt"));
            while((line = reader.readLine()) !=null){
            model.addRow(line.split(", "));           
            }
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buffer Reader Issu.");
            
        }
    }
}
