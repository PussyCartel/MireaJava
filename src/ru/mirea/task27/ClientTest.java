package ru.mirea.task27;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void setEmail() {
        Client client = new Client(0, null, null, null, null);
        client.setEmail("pstsyngalev@mail.ru");
        Assert.assertNotNull(client.getEmail());
    }
    @Test
    public  void setPhoneNumber(){
        Client client = new Client(0, null, null, null, null);
        client.setPhoneNumber("+790sdfw");
        Assert.assertNotNull(client.getPhoneNumber());
    }
}