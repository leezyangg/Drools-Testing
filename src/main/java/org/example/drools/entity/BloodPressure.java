package org.example.drools.entity;

public class BloodPressure {
    private final int systolic;
    private final int diastolic;

    public BloodPressure(int systolic, int diastolic) {
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }
}
