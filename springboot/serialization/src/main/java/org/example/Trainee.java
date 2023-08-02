package org.example;

import java.io.Serializable;

public class Trainee implements Serializable {
    private static final long serialVersionUID=10L;
    private int traineeId;
    private String traineeName;
    private String traineeLocation;
    private Batch batch;
    public Trainee(int traineeId,String traineeName,String traineeLocation,Batch batch){
        this.traineeId=traineeId;
        this.traineeName=traineeName;
        this.traineeLocation=traineeLocation;
        this.batch=batch;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "traineeId=" + traineeId +
                ", traineeName='" + traineeName + '\'' +
                ", traineeLocation='" + traineeLocation + '\'' +
                ", batch=" + batch +
                '}';
    }

    public Trainee() {
    }

    public int getTrainee_id() {
        return traineeId;
    }

    public void setTrainee_id(int trainee_id) {
        this.traineeId = traineeId;
    }

    public String getTrainee_name() {
        return traineeName;
    }

    public void setTrainee_name(String trainee_name) {
        this.traineeName = traineeName;
    }

    public String getTrainee_location() {
        return traineeLocation;
    }

    public void setTrainee_location(String trainee_location) {
        this.traineeLocation = traineeLocation;
    }
}
