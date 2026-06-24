package com.aaiaaba.fileiostreams.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamTest {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("C:/Users/Shirkant/work/test/test.png");
            fos = new FileOutputStream("C:/Users/Shirkant/work/test/testOut.png");

            int readData;

            while ((readData = fis.read()) != -1) {
                fos.write(readData);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
