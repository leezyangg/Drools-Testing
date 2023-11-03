package org.example.drools.entity;

public class NutritionRecommend {

    private String nutrition;
    private double quantity;
    private Mother mother;

    public NutritionRecommend(String nutrition, double quantity, Mother mother) {
        this.nutrition = nutrition;
        this.quantity = quantity;
        this.mother = mother;
    }

    public String getNutrition() {
        return nutrition;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Mother getMother() {
        return mother;
    }

    @Override
    public String toString() {
        return "NutritionRecommend[" +
                "nutrition='" + nutrition + '\'' +
                ", quantity=" + quantity +
                ']';
    }
}
