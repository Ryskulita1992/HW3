package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount dubaiIslamicBank = new BankAccount();
        {
            dubaiIslamicBank.Deposit(10000);
            while (true) {
                try {
                    if (dubaiIslamicBank.getAmount() > 1200) {
                        dubaiIslamicBank.withDraw(1000);
                        System.out.println("withdrawing  1000");
                    } else {
                        dubaiIslamicBank.withDraw(1000);
                        System.out.println("Remaining balance is less than 1000");
                    }
                } catch (Exception e) {
                    e.getMessage();
                    break;
                }
            }
        }












    }


        //Написать Main класс где бы создавался счет клиента. Положить 10 000 сом на счет.

    }
