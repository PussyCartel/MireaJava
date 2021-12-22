module ru.mirea.task11.jtextarea {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.mirea.task11.jtextarea to javafx.fxml;
    exports ru.mirea.task11.jtextarea;
}