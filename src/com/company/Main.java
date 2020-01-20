package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount dib = new BankAccount();
        {
            dib.deposit(10000);
            while (true) {
                try {
                    dib.withDraw(6000);
                }catch (LimitException e){
                    e.printStackTrace();
                    System.out.println("Ваш счёт "+dib.getAmount()+e.getMessage());
                    dib.withDraw(dib.getAmount());
                    System.out.println("Your balance"+dib.getAmount());

                    break;
                }
               }
            }
        }
        }


        //Написать Main класс где бы создавался счет клиента. Положить 10 000 сом на счет.
