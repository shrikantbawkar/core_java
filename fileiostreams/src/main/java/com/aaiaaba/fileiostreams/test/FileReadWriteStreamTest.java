package com.aaiaaba.fileiostreams.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteStreamTest {

    public static void main(String[] args) {
        FileReader fread = null;
        FileWriter fwrite = null;
        try {
            fread = new FileReader("C:/Users/Shirkant/work/test/testInput.txt");
            fwrite = new FileWriter("C:/Users/Shirkant/work/test/testOutput.txt");

            int readData;

            while ((readData = fread.read()) != -1) {
                fwrite.write(readData);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fread.close();
                fwrite.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
