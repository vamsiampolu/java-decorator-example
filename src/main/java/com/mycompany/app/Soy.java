package com.mycompany.app;

class Soy extends Condiment {
  Beverage beverage;
  String description = "Lactose intolerant, just substitute milk for soy milk";

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  String getDescription() {
    return beverage.getDescription() + ", " + description;
  }

  double getCost() {
    return beverage.getCost() + 0.45;
  }
}
