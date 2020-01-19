package com.company;

public class LimitException extends Exception {
    double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;


    }


    public double getRemainingAmount () {
        return getRemainingAmount();

    }
    //Затем попытаться снять через бесконечный цикл, каждую итерацию по 6000 сом, при этом отлавливать исключение LimitException и при возникновении такого исключения снимать только ту сумму которая осталась на счете и завершать бесконечный цикл
}

