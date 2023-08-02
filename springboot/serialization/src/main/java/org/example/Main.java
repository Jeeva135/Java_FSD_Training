package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Batch batch = null;

        batch = new Batch(1, "December August Batch", "Java FSD",
                LocalDate.of(2022, 8, 12),
                LocalDate.of(2023, 4, 23));
        Trainee trainee = new Trainee(1, "Jeeva", "Trivandrum", batch);
        Trainee result = new Trainee();
        TraineeIO traineeIO = new TraineeIO();
        try {
            traineeIO.serialize(trainee);
            result = traineeIO.deSerialization();
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}