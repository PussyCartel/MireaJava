package ru.mirea.task21;

import java.util.*;

public class Client {
    private int bankAccount;
    private int sum = 0;
    private String pinCode;
    private String lastName;
    private String firstName;
    private String ClientStatus;
    private Deque <String> history;

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public Client(int bankAccount, String lastName, String firstName, String clientStatus, String pinCode) {
        this.bankAccount = bankAccount;
        this.lastName = lastName;
        this.firstName = firstName;
        this.pinCode = pinCode;
        this.ClientStatus = clientStatus;
        this.history = new LinkedList<>();;
    }

    public String getName(){
        return (firstName + " " + lastName);
    }
    public void setName(String lName, String fName){
        try{
            lastName = lName;
            firstName = fName;
        }
        catch (NullPointerException e){
            System.out.println("Exception was processed. Program continues");
        }
    }

    public int getBankAccount()  {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getClientStatus() {
        return ClientStatus;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setClientStatus(String clientStatus) {
        try{
            ClientStatus = clientStatus;
        }
        catch (NullPointerException e){
            System.out.println("Exception was processed. Program continues");
        }
    }

    public String viewInvoice(){
        return "Остаток на счете " + sum;
    }

    public void transferMoney(int bankAccount, int sum){
        /* Перевод другому клиенту*/
        try {
            this.sum = this.sum - sum;
            if(this.sum < 0){
                throw new Exception("нельзя перевести отрицательную сумму");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        Calendar calendar = new GregorianCalendar();
        Date date = calendar.getTime();
        System.out.println("Вы перевели клиенту №" + bankAccount + " сумму " + sum);
        history.addLast(date + " Вы перевели клиенту №" + bankAccount + " сумму " + sum);
    }
}
