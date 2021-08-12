package ua.univer.lesson12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
class MarkIllegalException extends Exception{
    public MarkIllegalException() {
        super();
    }

    public MarkIllegalException(String message) {
        super(message);
    }
}
public class ProgramExept {
    static Logger log = Logger.getLogger(ProgramExept.class.getSimpleName());
    static {
        try {
            log.setLevel(Level.SEVERE);
            FileHandler fh = new FileHandler(ProgramExept.class.getSimpleName()+".log",true);
            fh.setFormatter(new SimpleFormatter());
            log.addHandler(fh);
        } catch (IOException e) {
          //  e.printStackTrace();
           log.severe("Can't create log file "+ Arrays.toString(e.getStackTrace()));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = getMark(sc);
            log.info("mas[" + i + "] = " + mas[i]);
        }

        log.info("main exit");
        sc.close();
    }

    private static int getMark(Scanner sc) {
        while (true)
            try {
                System.out.println("enter int mark");
                int value = getIntValueFromConsole(sc);
                if (value < 0 || value > 12)
                    throw new MarkIllegalException("Not Mark");
                return value;
            } catch (MarkIllegalException e) {
                log.severe(" not mark, try again "+ Arrays.toString(e.getStackTrace()));
            }
    }

    private static int getIntValueFromConsole(Scanner sc) {
        while (true) {
            try {
                String valueStr = sc.next();
                log.info("value str =" + valueStr);
                int value = Integer.parseInt(valueStr);
                return value;
            } catch (NumberFormatException e) {
                log.severe("not int, try again");
                sc.nextLine();
            }
        }

    }
}
