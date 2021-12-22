package ru.mirea.task19;

public class Test19 {
    public static void main(String[] args){
        Client client = new Client( 0,"Default", "Default", "Default", "0000");
        System.out.println(client.getBankAccount() + " " + client.getName() + " " + client.getClientStatus() + " " + client.viewInvoice() + " " + client.getPinCode());
        client.setBankAccount(1);
        client.setName("Tsyngalev", "Pavel");
        client.setClientStatus("VIP");
        client.setPinCode("1111");
        System.out.println(client.getBankAccount() + " " + client.getName() + " " + client.getClientStatus() + " " + client.viewInvoice()+ " " + client.getPinCode());
        client.transferMoney(2, 200);
        System.out.println(client.viewInvoice());

        Administation administation = new Administation(1, "Default", "Default");
        System.out.println(administation.infStaff());
        administation.setName("Tsyngalev", "Pavel");
        administation.setId(5);
        System.out.println(administation.infStaff());
        administation.setBankAccount(500);
        administation.getBankAccount(500);
        administation.regNewClient(1, "Tsyngalev", "Pavel", "VIP", "1152");
        administation.helpClientStatus();
    }
}
