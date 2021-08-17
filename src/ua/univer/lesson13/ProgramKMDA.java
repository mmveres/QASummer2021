package ua.univer.lesson13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramKMDA {
    public static void main(String[] args) throws IOException {

     //   List<UserKMDA> users = getUsersFromFile("lipen-2019.csv");
     //   System.out.println(users);
     //   System.out.println(KMDAUtil.getMaxOklad(users));
        String url = "https://data.gov.ua/dataset/770cc750-4333-424f-b6e9-6e6c5c76aec9/resource/59cb6066-1fac-41ed-a571-811db551c75b/download/zp-lupen-2019.csv";
        List<UserKMDA> usersUrl = getUsersFromUrl(url);
        System.out.println(usersUrl);
    }
    private static List<UserKMDA> getUsersFromUrl(String url) throws IOException {
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        connection.getInputStream(),Charset.forName("WINDOWS-1251")));
       // BufferedReader br = new BufferedReader(new FileReader(fileName, Charset.forName("WINDOWS-1251")));
        List<UserKMDA> users = getUserKMDAS(br);
        return users;
    }
    private static List<UserKMDA> getUsersFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName, Charset.forName("WINDOWS-1251")));
        List<UserKMDA> users = getUserKMDAS(br);
        return users;
    }

    private static List<UserKMDA> getUserKMDAS(BufferedReader br) throws IOException {
        List<UserKMDA> users = new ArrayList<>();
        String str0 = br.readLine();
        String[] titles = str0.split(";");
        while (br.ready()) {
            String str = br.readLine();
            String[] elems = str.split(";");
            users.add(new UserKMDA(
                    elems[0],
                    elems[1],
                    Double.parseDouble(elems[2].replace(",", "."))
            ));
        }
        return users;
    }
}
