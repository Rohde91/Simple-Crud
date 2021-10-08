package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

    public static void main(String[] args) {

        try {
            File myObj = new File("BobRoss.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println("File content:");
                System.out.println(data);
                //Udskriver data inde i filen.
            }
            myReader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
        }
        File myObj = new File("BobRoss.txt");
        System.out.println("File information:");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
            //if statement udskriver alt information omkring filen.
        } else {
            System.out.println("The file does not exist!");
            //hvis fejl sker.
        }
    }
}
