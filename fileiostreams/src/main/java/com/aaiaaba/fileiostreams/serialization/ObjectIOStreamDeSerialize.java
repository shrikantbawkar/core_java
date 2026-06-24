package com.aaiaaba.fileiostreams.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOStreamDeSerialize {

    public static void main(String[] args) {

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("C:/Users/Shirkant/work/test/EmpNew.ser");
            ois = new ObjectInputStream(fis);

            Employee obj = (Employee) ois.readObject();

            System.out.println(obj);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
