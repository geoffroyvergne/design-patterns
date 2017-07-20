package com.base.construction.builder;

public class BuilderPatternDemo {
  public static void main(String[] args) {

    MealBuilder mealBuilder = new MealBuilder();

    Meal vegMeal = mealBuilder.prepareVegMeal();
    System.out.println("Veg Meal");
    vegMeal.showItems();
    System.out.println("Total Cost: " + vegMeal.getCost());

    System.out.println("\n\n");

    Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
    System.out.println("Non-Veg Meal");
    nonVegMeal.showItems();
    System.out.println("Total Cost: " + nonVegMeal.getCost());
  }
}
