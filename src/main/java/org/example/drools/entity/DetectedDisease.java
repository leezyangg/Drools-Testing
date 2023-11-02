package org.example.drools.entity;

public class DetectedDisease {
    private String diseaseName;
    private String severity;
    private Mother mother;

    public DetectedDisease(String diseaseName, String severity, Mother mother) {
        this.diseaseName = diseaseName;
        this.severity = severity;
        this.mother = mother;
    }

    public DetectedDisease(String diseaseName, Mother mother) {
        this.diseaseName = diseaseName;
        this.mother = mother;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public String getSeverity() {
        return severity;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }
}
