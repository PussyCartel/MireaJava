package ru.mirea.task25;

import ru.mirea.task24.EmailCheck;
import ru.mirea.task24.PhoneNumberCheck;

import java.util.*;

public class Client {
    private long bankAccount;
    private double sum = 0;
    private String pinCode;
    private String lastName;
    private String firstName;
    private String ClientStatus;
    private String email, phoneNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        ru.mirea.task24.EmailCheck emailCheck = new EmailCheck();

        if (emailCheck.validate(email))
            this.email = email;
        else {
            System.out.println("Введенный email не соответствует требованиям");
            this.email = "not stated";
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber() {
        ru.mirea.task24.PhoneNumberCheck phoneNumberCheck = new PhoneNumberCheck();
        if (phoneNumberCheck.validate(phoneNumber))
            this.phoneNumber = phoneNumber;
        else {
            System.out.println("Введенный номер телефона не соответствует требованиям");
            this.phoneNumber = "not stated";
        }
    }

    private Deque <String> history;
    Date validityPeriod;

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public Client(long bankAccount, String lastName, String firstName, String clientStatus, String pinCode) {
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

    public long getBankAccount()  {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getClientStatus() {
        return ClientStatus;
    }

    public void setSum(double sum) {
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
    @Override
    public int hashCode() {
        int result = validityPeriod.hashCode();
        result = (int) (53 * result + bankAccount);
        result = (int) (53 * result + sum);
        return result;
    }
}
