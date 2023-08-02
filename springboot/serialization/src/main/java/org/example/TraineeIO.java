package org.example;

import java.io.*;

public class TraineeIO {
    File file;

    public TraineeIO(){
        file=new File("trainees.ser");
    }

    public void serialize(Trainee trainee) throws IOException{
        try(FileOutputStream fileOutputStream=new FileOutputStream(file);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(trainee);
            objectOutputStream.flush();
        }
    }
    public Trainee deSerialization() throws IOException,ClassNotFoundException {
        Trainee trainee = null;
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            trainee = (Trainee) objectInputStream.readObject();
        }
        return trainee;
    }
    }
