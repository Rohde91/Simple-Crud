package com.company;

import java.io.File;

public class Delete {

    public static void main(String[] args) {

        File myObj = new File("BobRoss.txt");
        if (myObj.delete()){
            System.out.println("File: " + myObj.getName() + " deleted.");
            //confirmation
        }
        else {
            System.out.println("File could not be deleted");
            System.out.println("File might not exist");
        }

    }
}
