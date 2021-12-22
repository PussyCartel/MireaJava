package ru.mirea.task27;

import ru.mirea.task24.Client;

import java.io.Serializable;
import java.util.HashMap;
 class Department {
    public void print() {
        System.out.println("Вы принадлежите отделу №");
    }

     public class Clerk extends Department {
         @Override
         public void print() {
             System.out.println("Вы клерк, поздравляю");
         }
     }

     public class Manager extends Department {
         @Override
         public void print() {
             System.out.println("Вы менеджер");
         }
     }
 }

public class Bank implements Serializable {
    private long totalMoney = 0;
    private HashMap<Integer, Client> clients;
    private HashMap<Integer, Administation> administations;
    private static final long serialVersionUID = 2L;

    public Bank(long totalMoney, HashMap<Integer, Client> clients, HashMap<Integer, ru.mirea.task27.Administation> administation) {
        this.totalMoney = totalMoney;
        this.clients = clients;
        this.administations = administation;
    }

    public void lookClientInvoice(int bankAccount){
        /*действие*/
    }
    public void regNewAdmin(String lName, String fName, int id){
        ru.mirea.task27.Administation newAdmin = new ru.mirea.task27.Administation(id, lName, fName);
        administations.put(id, newAdmin);
    }
    public void accrualMoneyClient(int bA){
        /*действие*/
    }
    public void calculateTotalMoney(){
        System.out.println(this.totalMoney);
    }

    public void addMoney(int sum){
        this.totalMoney = sum;
    }
    public long vewTotalMoney(){
        return this.totalMoney;
    }
    public void recognize(int id){
        if(id > 665 && id < 1000){
            Department human = new Department().new Clerk();
            human.print();
        }
        else if(id < 665 && id >100){
            Department human = new Department().new Manager();
            human.print();
        }
    }

}

