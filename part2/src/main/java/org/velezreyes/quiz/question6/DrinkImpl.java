package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink{

    boolean fizzy;
    String name;

    public DrinkImpl(String name) {

        this.name=name;

        switch (name){
            case "ScottCola":
                this.fizzy = true;
                break;
            case "KarenTea":
                this.fizzy=false;
                break;
        }

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFizzy() {
        return fizzy;
    }
}
