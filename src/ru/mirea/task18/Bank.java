package ru.mirea.task18;

import java.util.HashMap;

public class Bank {
    private long totalMoney = 0;
    private HashMap<Integer, Client> clients;
    private HashMap<Integer, Administation> administation;

    public Bank(long totalMoney, HashMap<Integer, Client> clients, HashMap<Integer, Administation> administation) {
        this.totalMoney = totalMoney;
        this.clients = clients;
        this.administation = administation;
    }

    public void lookClientInvoice(int bankAccount){
        /*действие*/
    }
    public void regNewAdmin(int bankAccount, String lName, String fName){
        /*действие*/
    }
    public void accrualMoneyClient(int bA){
        /*действие*/
    }
    public void calculateTotalMoney(){
        /*действие*/
    }
    public void addMoney(int sum){
        this.totalMoney = sum;
    }
    public long vewTotalMoney(){
        return this.totalMoney;
    }
}
