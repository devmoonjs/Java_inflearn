package oop1.ex;

public class Account {

    int balance; // 잔액
    int amount; // 돈 액수

    int deposit(int amount){ // 입금
        balance += amount;
        return balance;
    }

    int withdraw(int amount){
        if(balance-amount>=0){
            balance -= amount;

        } else{
            System.out.println("잔고 부족");
            System.out.println("잔고 : " + balance);
        }
        return balance;
    }
}
