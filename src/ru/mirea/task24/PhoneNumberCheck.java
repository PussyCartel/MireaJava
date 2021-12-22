package ru.mirea.task24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberCheck {
    private Pattern pattern;
    private Matcher matcher;

    //задаем регулярное выражение для дальнейшей проверки
    private static final String PHONE_PATTERN = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";

    //компиляция регулярного выражения
    public PhoneNumberCheck() {
        pattern = Pattern.compile(PHONE_PATTERN);
    }

    //выполнение проверки
    public boolean validate(final String hex) {
        matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
