package org.example.drools.entity;

import java.util.ArrayList;
import java.util.List;

public class Mother {
    private String name;
    private int age;
    private String dietReligious;
    private List<FamilyDisease> familyDiseases = new ArrayList<>();
    private List<String> historicalDisease = new ArrayList<>();
    private List<String> allergyFood = new ArrayList<>();
    private BloodPressure bloodPressure;
    private double bloodSugar;
    private double haemoglobinLevel;
    private boolean isPregnant;
    private int trimester;
    private boolean isBreastFeeding;
    private String deliveryMethod;

    public Mother() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDietReligious() {
        return dietReligious;
    }

    public List<FamilyDisease> getFamilyDiseases() {
        return familyDiseases;
    }

    public List<String> getHistoricalDisease() {
        return historicalDisease;
    }

    public List<String> getAllergyFood() {
        return allergyFood;
    }

    public BloodPressure getBloodPressure() {
        return bloodPressure;
    }

    public double getBloodSugar() {
        return bloodSugar;
    }

    public double getHaemoglobinLevel() {
        return haemoglobinLevel;
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public int getTrimester() {
        return trimester;
    }

    public boolean isBreastFeeding() {
        return isBreastFeeding;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public static MotherBuilder newBuilder() {
        return new MotherBuilder();
    }

    public static final class MotherBuilder {
        private String name;
        private int age;
        private String dietReligious;
        private List<FamilyDisease> familyDiseases = new ArrayList<>();
        private List<String> historicalDisease = new ArrayList<>();
        private List<String> allergyFood = new ArrayList<>();
        private BloodPressure bloodPressure;
        private double bloodSugar;
        private double haemoglobinLevel;
        private boolean isPregnant;
        private int trimester;
        private boolean isBreastFeeding;
        private String deliveryMethod;

        private MotherBuilder() {
        }
        public MotherBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public MotherBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public MotherBuilder withDietReligious(String dietReligious) {
            this.dietReligious = dietReligious;
            return this;
        }

        public MotherBuilder withFamilyDiseases(List<FamilyDisease> familyDiseases) {
            this.familyDiseases = familyDiseases;
            return this;
        }

        public MotherBuilder withHistoricalDisease(List<String> historicalDisease) {
            this.historicalDisease = historicalDisease;
            return this;
        }

        public MotherBuilder withAllergyFood(List<String> allergyFood) {
            this.allergyFood = allergyFood;
            return this;
        }

        public MotherBuilder withBloodPressure(BloodPressure bloodPressure) {
            this.bloodPressure = bloodPressure;
            return this;
        }

        public MotherBuilder withBloodSugar(double bloodSugar) {
            this.bloodSugar = bloodSugar;
            return this;
        }

        public MotherBuilder withHaemoglobin(double haemoglobinLevel) {
            this.haemoglobinLevel = haemoglobinLevel;
            return this;
        }

        public MotherBuilder withPregnant(boolean isPregnant) {
            this.isPregnant = isPregnant;
            return this;
        }

        public MotherBuilder withTrimester(int trimester) {
            this.trimester = trimester;
            return this;
        }

        public MotherBuilder withBreastFeeding(boolean isBreastFeeding) {
            this.isBreastFeeding = isBreastFeeding;
            return this;
        }

        public MotherBuilder withDeliveryMethod(String deliveryMethod) {
            this.deliveryMethod = deliveryMethod;
            return this;
        }

        public Mother build() {
            Mother mother = new Mother();
            mother.name = name;
            mother.age = age;
            mother.dietReligious = dietReligious;
            mother.familyDiseases = familyDiseases;
            mother.historicalDisease = historicalDisease;
            mother.allergyFood = allergyFood;
            mother.bloodPressure = bloodPressure;
            mother.bloodSugar = bloodSugar;
            mother.haemoglobinLevel = haemoglobinLevel;
            mother.isPregnant = isPregnant;
            mother.trimester = trimester;
            mother.isBreastFeeding = isBreastFeeding;
            mother.deliveryMethod = deliveryMethod;
            return mother;
        }

    }
}

