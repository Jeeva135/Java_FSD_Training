package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileManager fileManager=new FileManager("Data.txt");
        char bulletSymbol='\u2023';
        fileManager.writeToFile(bulletSymbol+"Be punctual and prepared for class everyday\n");
        fileManager.writeToFile((bulletSymbol+"Adhere to training session and break timings\n"));
        fileManager.writeToFile(bulletSymbol+"Dress appropriately and adhere to UST dress code policy\n");
        fileManager.writeToFile(bulletSymbol+"Ask questions and seek clarifications\n");
        fileManager.writeToFile(bulletSymbol+"Show courtesy to the speaker and wait your turn\n");
        fileManager.printFromFile();
    }

}