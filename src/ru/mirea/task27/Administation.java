package ru.mirea.task27;

import ru.mirea.task24.Printers;

public class Administation {

    private int id, bA;
    private String lastName;
    private String firstName;
    enum clientStatus{
        Default, VIP, GOLD, Platinum
    }

    public void setId(int id) {
        this.id = id;
    }

    public Administation(int id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public void regNewClient(int bankAccount, String lName, String fName, String clientStatus, String pinCode){
        /* действие */
        System.out.println("Клиент успешно зарегистрирован, сотрудник id " + id);
    }
    public void setBankAccount(int bA){
        /*Действие*/
        this.bA = bA;
        System.out.println("Номер счета клиента успешно изменен, изменил сотрудник id " + id );
    }
    public int getBankAccount(){
        /*Действие*/
        System.out.println("Клиент с именем unknown" + ", запрос выполнил сотрудник id " + id);
        return bA;
    }
    public void helpClientStatus(){
        System.out.println("Возможные статусы клиента");
        Printers printers = new Printers();
        printers.print(clientStatus.values());
    }
    public String infStaff(){
        return id + " " + lastName + " " + firstName;
    }
    public void setName(String lastName, String firstName){
        this.lastName=lastName;
        this.firstName=firstName;
    }

}
