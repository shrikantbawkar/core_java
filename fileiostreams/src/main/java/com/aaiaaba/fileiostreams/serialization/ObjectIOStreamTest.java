package com.aaiaaba.fileiostreams.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectIOStreamTest {

    public static void main(String[] args) {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("C:/Users/Shirkant/work/test/EmpNew.ser");
            oos = new ObjectOutputStream(fos);

            Employee emp = new Employee(1, "aaiaaba", 10000000, 12345);

            oos.writeObject(emp);
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
