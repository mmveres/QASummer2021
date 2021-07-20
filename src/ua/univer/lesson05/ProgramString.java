package ua.univer.lesson05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class StringsBenchMark {
    public static void main(String[] args) {
        long beginTime, elapsedTime;

        // Build a long string
        String str = "";
        int size = 16536;
        char ch = 'a';
        beginTime = System.nanoTime();   // Reference time in nanoseconds
        for (int count = 0; count < size; ++count) {
            str += ch;
            ++ch;
            if (ch > 'z') {
                ch = 'a';
            }
        }
        elapsedTime = System.nanoTime() - beginTime;
        System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Build String)");
        System.out.println(str.length());
        // Reverse a String by building another String character-by-character in the reverse order
        String strReverse = "";
        beginTime = System.nanoTime();
        for (int pos = str.length() - 1; pos >= 0 ; pos--) {
            strReverse += str.charAt(pos);   // Concatenate
        }
        elapsedTime = System.nanoTime() - beginTime;

        System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using String to reverse)");

        // Reverse a String via an empty StringBuffer by appending characters in the reverse order
        beginTime = System.nanoTime();
        StringBuffer sBufferReverse = new StringBuffer();
        for (int pos = str.length() - 1; pos >= 0 ; pos--) {
            sBufferReverse.append(str.charAt(pos));      // append
        }
        elapsedTime = System.nanoTime() - beginTime;
        System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using StringBuffer to reverse)");
        System.out.println(sBufferReverse.length()+"/"+sBufferReverse.capacity());
        System.out.println(sBufferReverse.toString().length());

        // Reverse a String by creating a StringBuffer with the given String and invoke its reverse()
        beginTime = System.nanoTime();
        StringBuffer sBufferReverseMethod = new StringBuffer(str);
        sBufferReverseMethod.reverse();     // use reverse() method
        elapsedTime = System.nanoTime() - beginTime;
        System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using StringBuffer's reverse() method)");

        // Reverse a String via an empty StringBuilder by appending characters in the reverse order
        beginTime = System.nanoTime();
        StringBuilder sBuilderReverse = new StringBuilder(size);
        for (int pos = str.length() - 1; pos >= 0 ; pos--) {
            sBuilderReverse.append(str.charAt(pos));
        }
        elapsedTime = System.nanoTime() - beginTime;
        System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using StringBuilder to reverse)");

        // Reverse a String by creating a StringBuilder with the given String and invoke its reverse()
        beginTime = System.nanoTime();
        StringBuffer sBuilderReverseMethod = new StringBuffer(str);
        sBuilderReverseMethod.reverse();
        elapsedTime = System.nanoTime() - beginTime;
        System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using StringBuidler's reverse() method)");
    }
}
public class ProgramString {
    public static void main(String[] args) throws FileNotFoundException {
        //stringTest();
        //String str = "mama mila ramu ramu mila mama mama";
       // String str = getStringFromConsole();
        String str = getStringFromFile();
        String [] words = str.split("\\s");
        System.out.println(words.length);
        for (String word: words) {
            System.out.println(word);
            for (int j = 0; j < word.length(); j++) {
                System.out.println(word.charAt(j));
            }
        }



     //   System.out.println(Arrays.toString(words));
    //    String strTato=str.replace("mama","tato");
    //    System.out.println(strTato);
    }
    private static String getStringFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("text.txt"));
        StringBuilder sb = new StringBuilder();
        while(sc.hasNextLine())
            sb.append(sc.nextLine()).append(" ");
        sc.close();
        return sb.toString();
    }

    private static String getStringFromConsole() {
        System.out.println("Enter words");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        return str;
    }

    private static void stringTest() {
        String str = "a";
        str=str+"b";
        String str1 = "a";
        StringBuilder sb = new StringBuilder();
        StringBuffer sbuf;

        String strIn = "mama mila ramu";
        System.out.println(strIn.length());
        sb.append(strIn);
        System.out.println(sb.length()+"/"+sb.capacity());
        sb.append("mama");
        System.out.println(sb.length()+"/"+sb.capacity());
        sb.append("mila");
        System.out.println(sb.length()+"/"+sb.capacity());
        sb.append("ramu");
        System.out.println(sb.length()+"/"+sb.capacity());
    }
}
