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
public class OrderListModel {
    private int orderNo;
    private int menuNo;
    private int mealNo;
    private int memberNo;
    private int orderCount;
    private int amount;
    private Date orderDate;
}
