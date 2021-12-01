package com.mealProject.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderListModel2 {
    private int menuNo;
    private String mealName;
    private String memberName;
    private int orderCount;
    private int amount;
    private Date orderDate;
}
