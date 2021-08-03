package ua.univer.lesson09;

import java.util.Arrays;
import java.util.List;

public class ProgramWild {
    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> ls =
                Arrays.asList("one", "two", "three");

        printList(ls);
    }
}
