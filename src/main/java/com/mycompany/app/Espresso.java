package com.mycompany.app;

public class Espresso extends Beverage {
  String description = "Our dark espresso will soothe your soul";

  String getDescription() {
    return description;
  } 

  double getCost() {
    return 0.59;
  }
}
