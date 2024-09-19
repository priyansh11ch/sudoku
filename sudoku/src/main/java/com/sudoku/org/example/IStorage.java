package com.sudoku.org.example;

import java.io.IOException;

public interface IStorage
{
    void upadteGameData(Game g) throws IOException;
    Game getGameData() throws IOException;
}
