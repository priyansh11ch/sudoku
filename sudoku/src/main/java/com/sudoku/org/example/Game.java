package com.sudoku.org.example;

import com.sudoku.Constants.GameState;
import com.sudoku.computationLogic.SudokuUtilities;

import java.io.Serializable;

public class Game implements Serializable
{
    private final GameState gamestate;
    private final int[][] gridstate;

    public static final int GRID_BOUNDARY = 9;

    public Game(GameState gamestate, int[][] gridstate)
    {
        this.gamestate = gamestate;
        this.gridstate = gridstate;
    }

    public GameState getGamestate()
    {
        return gamestate;
    }

    public int[][] getCopyofGridState() {
        return SudokuUtilities.copyToNewArray(gridstate);
    }
}
