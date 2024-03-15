package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter11.files;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileChooserApp {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        Scanner in = null;

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            //in = new Scanner(selectedFile);
        }
        while (in.hasNext()) {
            System.out.print(in.next());
        }
    }
}
