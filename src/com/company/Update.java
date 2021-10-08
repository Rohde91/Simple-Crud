package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Update {

    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("BobRoss.txt");
            myWriter.write("Some new context");
            //overstående OVERSKRIVER! indholdet i filen
            myWriter.close();
            System.out.println("Wrote to file.");
            //confirmation
        }
        catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
