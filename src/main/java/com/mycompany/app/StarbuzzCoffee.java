package com.mycompany.app;

class StarbuzzCoffee {
  Beverage makeDoubleMochaSoyLatteWithWhip() {
    Beverage base = new DarkRoast();
    Beverage mochaDoubleShot = new Mocha(new Mocha(base));
    Beverage doubleMochaSoy = new Soy(mochaDoubleShot);
    Beverage doubleMochaSoyLatte = new SteamedMilk(doubleMochaSoy);
    return doubleMochaSoyLatte;
  }

  Beverage makeHouseBlendSoyWhipMocha() {
    Beverage base = new HouseBlend();
    return new Whip(
      new Soy(base)
    );
  }
}
