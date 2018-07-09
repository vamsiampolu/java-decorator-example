package com.mycompany.app;

class Mocha extends Condiment {
  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  String description = "Silky smooth chocolate mocha";

  String getDescription() {
    return beverage.getDescription() + ", " + description;
  }

  double getCost() {
    return beverage.getCost() + 0.25;
  }
}
