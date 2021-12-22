package ru.mirea.task26;

import ru.mirea.task24.Bailiff;
import ru.mirea.task24.Collectors;
import ru.mirea.task24.SpecialServices;
import ru.mirea.task24.SpecialServicesType;

public class SpecialServicesWork {
    public SpecialServices orderSpecialServices(SpecialServicesType type, int id){
        SpecialServices specialServicesType = null;
        switch (type) {
            case COLLECTORS: {
                specialServicesType = new Collectors();
                break;
            }
            case BAILIFF: {
                specialServicesType = new Bailiff();
                break;
            }
        }
        specialServicesType.getDebtor(id);
        specialServicesType.collectMoney();
        System.out.println("Должник погасил задолженность!");

        return specialServicesType;
    }
}
