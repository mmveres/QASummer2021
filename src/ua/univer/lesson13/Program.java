package ua.univer.lesson13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws IOException {
        int [] mas ={1,2,3,4,3,5,6,7,78,8};
      //  writeMasToCsv(mas, "out.csv");
        String[] words = UtilFile.getMasStringsFromFile("out.csv");
        int[] intValues = UtilFile.getIntValues(words);

        System.out.println(Arrays.toString(intValues));
    }


}
