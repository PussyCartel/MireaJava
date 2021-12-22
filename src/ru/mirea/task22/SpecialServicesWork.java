package ru.mirea.task22;

public class SpecialServicesWork {

    private final Factory specialistFactory;

    public SpecialServicesWork(Factory specialistFactory) {
        this.specialistFactory = specialistFactory;
    }
    public SpecialServices orderSpecialServices(SpecialServicesType type, int id){
        SpecialServices specialServicesType = specialistFactory.createSpecialist(type);
        specialServicesType.getDebtor(id);
        specialServicesType.collectMoney();
        System.out.println("Должник погасил задолженность!");

        return specialServicesType;
    }
}
