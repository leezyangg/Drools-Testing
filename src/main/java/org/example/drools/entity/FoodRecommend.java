package org.example.drools.entity;

public class FoodRecommend {
    private final String food;
    private final String recommendationType;
    private final Mother mother;

    public FoodRecommend(String food, String recommendationType, Mother mother) {
        this.food = food;
        this.recommendationType = recommendationType;
        this.mother = mother;
    }

    public String getFood() {
        return food;
    }

    public String getRecommendationType() {
        return recommendationType;
    }

    public Mother getMother() {
        return mother;
    }

    @Override
    public String toString() {
        return "FoodRecommend[" +
                "food='" + food + '\'' +
                ", recommendationType='" + recommendationType + '\'' +
                ']';
    }


}
