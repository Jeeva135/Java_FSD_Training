package org.example;

import java.io.Serializable;
import java.time.LocalDate;


public class Batch implements Serializable {
    private static final long serialVersionUID=10L;
    private int batchId;
    private String batchName;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    public Batch(int batchId, String batchName, String description, LocalDate startDate, LocalDate endDate) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Batch() {
    }

    public int getBatchId() {
        return batchId;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchId=" + batchId +
                ", batchName='" + batchName + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
