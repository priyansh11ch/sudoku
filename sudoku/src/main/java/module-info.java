module com.sudoku {
    requires javafx.controls;
    requires javafx.fxml;

    // opens com.sudoku to javafx.fxml;
    // exports com.sudoku;

    exports com.sudoku.org.example to javafx.graphics;
    exports com.sudoku.Constants;
}