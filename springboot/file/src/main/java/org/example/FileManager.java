package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    private  String fileName;

    public FileManager(String fileName){
        this.fileName=fileName;
    }

    public void writeToFile(String data)throws IOException {
        FileWriter writer=new FileWriter(fileName,true);
        writer.write(data);
        writer.flush();
        writer.close();
    }

    public void printFromFile(){
        try(FileReader fileReader=new FileReader(fileName)){
            try(BufferedReader bufferedReader=new BufferedReader(fileReader)){
                String line=bufferedReader.readLine();
                while (line!=null){
                    System.out.println(line);
                    line= bufferedReader.readLine();
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
