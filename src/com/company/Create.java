package com.company;

import java.io.File;
import java.io.IOException;

public class Create {

    public static void main(String[] args) {

        try {
            File myobj = new File("BobRoss.txt");
            //pathname laver filen med det indskrevede navn.
            if (myobj.createNewFile()) {
                System.out.println("File: " + myobj.getName() + " created");
            } else {
                System.out.println("File: " + myobj.getName() + " allready exists.");
            }
        }
        catch (IOException e){
            //catch fanger en potentiel fejl (hvis if/else fejler)
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
