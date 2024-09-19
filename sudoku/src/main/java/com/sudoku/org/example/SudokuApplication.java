package com.sudoku.org.example;

import com.sudoku.BuildLogic.SudokuBuildLogic;
import javafx.application.Application;
import javafx.stage.Stage;
import com.sudoku.user_Interface.IUserInterfaceContract;
import com.sudoku.user_Interface.interface_impl;

import java.io.IOException;

public class SudokuApplication extends Application
{
    private IUserInterfaceContract.View uiImpl;

    public static void main(String[] strings)
    {
        launch();
    }

    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) throws Exception
    {
        uiImpl = new interface_impl(primaryStage);
        try
        {
            SudokuBuildLogic.build(uiImpl);
        }
        catch(IOException e)
        {
            e.printStackTrace();
            throw e;
        }
    }
}
