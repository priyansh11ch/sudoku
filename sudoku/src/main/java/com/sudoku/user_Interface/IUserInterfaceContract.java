package com.sudoku.user_Interface;

import javafx.scene.input.KeyEvent;
import com.sudoku.org.example.Game;

public interface IUserInterfaceContract
{
    interface EventListener
    {
        void onSudokuInput(int x, int y, int input);
        void onDialogClick();
    }

    interface View
    {
        void handle(KeyEvent keyEvent);

        void setListener(IUserInterfaceContract.EventListener listener);
        void updateSquare(int x, int y, int input);
        void updateBoard(Game g);
        void showDialog(String msg);
        void showError(String msg);
    }
}
