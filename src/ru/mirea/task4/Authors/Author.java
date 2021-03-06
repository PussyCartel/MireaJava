package ru.mirea.task4.Authors;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        if(this.getGender() == 'M')
            return "Author{" +
                    "gender=" + "мужской" +
                    '}';
        else return "Author{" +
                "gender=" + "женский" +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
