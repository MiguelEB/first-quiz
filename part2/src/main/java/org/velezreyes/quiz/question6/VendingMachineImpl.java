package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  int coin = 0;

  public static VendingMachine getInstance() {
    VendingMachine vm = new VendingMachineImpl();
    return vm;
  }


  @java.lang.Override
  public void insertQuarter() {
    coin++;
  }

  @java.lang.Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {

    Drink drink = null;
    switch (name){
      case "ScottCola":
        if (coin<3){
          throw new NotEnoughMoneyException();
        } else {
          drink = new DrinkImpl(name);
          coin=coin-3;
        }
        break;

      case "KarenTea":
        if (coin<4){
          throw new NotEnoughMoneyException();
        } else {
          drink = new DrinkImpl(name);
          coin=coin-4;
        }
        break;
      default:
        throw new UnknownDrinkException();
    }

    /*if (coin<3){
      throw new NotEnoughMoneyException();
    }else if (name.equals("ScottCola")&&coin>=3){
      DrinkImpl drink = new DrinkImpl(name);
      coin = coin - 3;
      return drink;
    }
     else {
       throw new NotEnoughMoneyException();
    }*/
    return drink;
  }
}
