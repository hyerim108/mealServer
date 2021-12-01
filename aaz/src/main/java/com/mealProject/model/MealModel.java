package com.mealProject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MealModel {
    private int mealNo;
    private int menuNo;
    private String mealName;
    private int price;
    private int maxCount;
    private int todayMeal;
}
