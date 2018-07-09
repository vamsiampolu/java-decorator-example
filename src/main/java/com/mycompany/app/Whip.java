package com.mycompany.app;

class Whip extends Condiment {
  Beverage beverage;
  String description = "Add some delicious whipped cream to your coffee";

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  String getDescription() {
    return beverage.getDescription() + ", " + description;
  }

  double getCost() { 
    return beverage.getCost() + 0.35;
  }
}
