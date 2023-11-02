package org.example.drools.entity;

public class ExerciseRecommend {
    private final String exercise;
    private final String recommendationType;
    private final Mother mother;

    public ExerciseRecommend(String exercise, String recommendationType, Mother mother) {
        this.exercise = exercise;
        this.recommendationType = recommendationType;
        this.mother = mother;
    }

    public String getExercise() {
        return exercise;
    }

    public String getRecommendationType() {
        return recommendationType;
    }

    public Mother getMother() {
        return mother;
    }

    @Override
    public String toString() {
        return "ExerciseRecommend[" +
                "exercise='" + exercise + '\'' +
                ", recommendationType='" + recommendationType + '\'' +
                ", mother=" + mother.getName() +
                ']';
    }
}
