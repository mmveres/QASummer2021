package ua.univer.lesson14;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class ProgramSer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Droid d1 = new Droid("R2D2", 10, 90);
        d1.addWeapon("Rocket");
        Droid.armyName = "A";
        serializeBin(d1);
        Droid.armyName = "B";
        Droid d2 = deserializeBin();
        System.out.println(d2);


        try(XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("droid.xml")))) {
            xmlEncoder.writeObject(d1);
            xmlEncoder.flush();
        }

        try(XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("droid.xml")))) {
            Droid d12 = (Droid) xmlDecoder.readObject();
            System.out.println(d12);;
        }
    }

    private static Droid deserializeBin() throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("droid.dat"))) {
            Droid d2 = (Droid) ois.readObject();
            return d2;
        }
    }

    private static void serializeBin(Droid d1) throws IOException {
        try( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("droid.dat"))){
         oos.writeObject(d1);
        }
    }

    private static void writeDroidsToFile() throws IOException {
        Droid [] droids = {
                new Droid("R2D1", 11, 95),
                new Droid("R2D2", 15, 90),
                new Droid("R2D3", 12, 97)
        };
        //  writeToCSV(d1,"d1.csv");
        //  writeAllToCSV(droids,"droids.csv");
        try(FileWriter fw = new FileWriter("droidsHelp.csv")){
            fw.write(DroidHelper.convertToCSV(droids));
        }
    }

}
