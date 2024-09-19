package com.sudoku.BuildLogic;

import com.sudoku.computationLogic.GameLogic;
import com.sudoku.org.example.IStorage;
import com.sudoku.org.example.Game;
import com.sudoku.persistance.LocalStorageImpl;
import com.sudoku.user_Interface.IUserInterfaceContract;
import com.sudoku.user_Interface.logic.ControlLogic;

import java.io.IOException;

public class SudokuBuildLogic
{
    public static void build(IUserInterfaceContract.View userInterface) throws IOException
    {
        Game initialState;
        IStorage storage = new LocalStorageImpl();

        try
        {
            initialState = storage.getGameData();
        }
        catch (IOException e)
        {
            initialState = GameLogic.getNewGame();
            storage.upadteGameData(initialState);
        }

        IUserInterfaceContract.EventListener uiLogic  = new ControlLogic(storage,userInterface);
        userInterface.setListener(uiLogic);
        userInterface.updateBoard(initialState);
    }
}
