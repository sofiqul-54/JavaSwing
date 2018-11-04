package com.sofiqul54.evidence_final_practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abu Rayhan
 */
public class Util {

    public static void writeToFile(String filename, List<Student> students) throws Exception {
        File destFile = new File(filename + ".txt");

        try {
            if (destFile.exists() == false) {
                System.out.println("We had creat a new file.");
                destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Student s : students) {
                out.append(s.getId() + "," + s.getName() + "," + s.getPassword() + "," + s.getEmail() + "," + s.getGender() + "," + s.getRound() + "\n");
            }
            out.close();
        } catch (Exception e) {
            System.out.println("COULD NOT LOG!!");
        }
    }

    public static void displayFromFile(String filename, DefaultTableModel model) {
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));
            while((line=reader.readLine())!=null){
            model.addRow(line.split(","));
            }
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buffered Reader issue.");
        }
    }
}
