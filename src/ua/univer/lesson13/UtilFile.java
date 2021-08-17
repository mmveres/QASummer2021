package ua.univer.lesson13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class UtilFile {
    public static int[] getIntValues(String[] words) {
        int [] intValues = new int[words.length];
        for (int i = 0; i < intValues.length; i++) {
            double tempValue = Double.parseDouble(words[i].replace(",", "."));
            intValues[i] = (int) tempValue;
        }
        return intValues;
    }

    public static String[] getMasStringsFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName, Charset.forName("WINDOWS-1251")));
        String str = br.readLine();
        String [] words = str.split(";");
        return words;
    }

    public static void writeMasToCsv(int[] mas, String fileName) throws IOException {

        FileWriter fw = new FileWriter(fileName);
        //  fw.write(Arrays.toString(mas));
        for(var elem : mas)
            fw.write(elem+";");
        fw.close();
    }

    public static void writeMasToFile(int[] mas, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        //  fw.write(Arrays.toString(mas));
        for(var elem : mas)
            fw.write(elem+"");
        fw.close();
    }
}
