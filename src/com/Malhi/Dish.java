package com.Malhi;

import java.util.List;

public class Dish {
    private String dishName;
    private int calories;
    private List<String> ingredients;
    private DishType dishType;
    private int rating;

    public Dish(String dishName, int calories, List<String> ingredients, DishType dishType) {
        this.dishName = dishName;
        this.calories = calories;
        this.ingredients = ingredients;
        this.dishType = dishType;

    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDishName() {
        return dishName;
    }

    public int getCalories() {
        return calories;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                ", calories=" + calories +
                ", ingredients=" + ingredients +
                ", dishType=" + dishType +
                ", rating=" + rating +
                '}';
    }
}
