module ru.mirea.task8.opt1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.mirea.task8.opt1 to javafx.fxml;
    exports ru.mirea.task8.opt1;
}