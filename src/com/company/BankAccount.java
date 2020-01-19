package com.company;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class BankAccount  extends Exception {
    double Amount;

    public double getAmount() {
        return Amount;
    }

    public void Deposit(double sum){
        Amount= Amount+sum;
        System.out.println("balance:" + Amount);

    }
    public void withDraw(double sum) throws LimitException{
//        System.out.println("Insert Your card, Please");
        //Sleep method
        if (sum>Amount) {
            throw new LimitException("Your requiring amount for withdrawal is >  than your amount", Amount);
        }
            Amount = Amount - sum;
        System.out.println("drawing "+sum);

    }


        }


















