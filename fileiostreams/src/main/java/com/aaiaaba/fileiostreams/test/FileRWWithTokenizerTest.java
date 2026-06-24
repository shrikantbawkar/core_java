package com.aaiaaba.fileiostreams.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRWWithTokenizerTest {

    public static void main(String[] args) {
        FileReader fread = null;
        FileWriter fwrite = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            fread = new FileReader("C:/Users/Shirkant/work/test/testInputNew.txt");
            fwrite = new FileWriter("C:/Users/Shirkant/work/test/testOutputNew.txt");

            br = new BufferedReader(fread);

            String readData;
            int cnt = 0;

            while ((readData = br.readLine()) != null) {
                if(cnt > 0) {
                    fwrite.write("//n");    
                }
                fwrite.write(readData);
                cnt++;
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
