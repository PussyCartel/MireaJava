package ru.mirea.task22;

public class Factory {
    public SpecialServices createSpecialist (SpecialServicesType type) {
        SpecialServices createSpecialist = null;

        switch (type) {
            case COLLECTORS:
                createSpecialist = new Collectors();
                break;
            case BAILIFF:
                createSpecialist = new Bailiff();
                break;
        }

        return createSpecialist;
    }
}
