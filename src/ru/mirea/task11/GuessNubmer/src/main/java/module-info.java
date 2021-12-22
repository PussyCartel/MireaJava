module ru.mirea.task11.guessnubmer {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.mirea.task11.guessnubmer to javafx.fxml;
    exports ru.mirea.task11.guessnubmer;
}