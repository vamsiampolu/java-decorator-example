package com.mycompany.app;

class SteamedMilk extends Condiment {
  Beverage beverage;
  String description = "Add steamed milk to your coffee";

  public SteamedMilk(Beverage beverage) {
    this.beverage = beverage;
  }

  String getDescription() {
    return beverage.getDescription() + ", " + description;
  }

  double getCost() {
    return beverage.getCost() + 0.15;
  }
}
