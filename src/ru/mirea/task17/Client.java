package ru.mirea.task17;

public class Client {
    private int bankAccount;
    private int sum = 0;
    private String pinCode;
    private String lastName;
    private String firstName;

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    private String ClientStatus;

    public Client(int bankAccount, String lastName, String firstName, String clientStatus, String pinCode) {
        this.bankAccount = bankAccount;
        this.lastName = lastName;
        this.firstName = firstName;
        this.pinCode = pinCode;
        ClientStatus = clientStatus;
    }

    public String getName(){
        return (firstName + " " + lastName);
    }
    public void setName(String lName, String fName){
        lastName = lName;
        firstName = fName;
    }

    public int getBankAccount() {
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
        ClientStatus = clientStatus;
    }

    public String viewInvoice(){
        return "Остаток на счете " + sum;
    }

    public void transferMoney(int bankAccount, int sum){
        /* Перевод другому клиенту*/
        this.sum = this.sum - sum;
        System.out.println("Вы перевели клиенту №" + bankAccount + " сумму " + sum);
    }
}
