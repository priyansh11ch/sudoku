package com.sudoku.persistance;

import com.sudoku.org.example.IStorage;
import com.sudoku.org.example.Game;

import java.io.*;

public class LocalStorageImpl implements IStorage
{
    private static File GAME_DATA = new File(System.getProperty("user.home"),
    "gamedata.txt"
        );

    @Override
    public void upadteGameData(Game g) throws IOException {
        try
        {
            FileOutputStream fileoutput = new FileOutputStream(GAME_DATA);
            ObjectOutputStream objectoutput = new ObjectOutputStream(fileoutput);
            objectoutput.writeObject(g);
            objectoutput.close();
        }
        catch(IOException e)
        {
            throw new IOException("Unable to access Game Data");
        }
    }

    @SuppressWarnings("resource")
    @Override
    public Game getGameData() throws IOException {
        FileInputStream fileinput = new FileInputStream(GAME_DATA);
        ObjectInputStream objectinput = new ObjectInputStream(fileinput);
        try
        {
            Game gameState = (Game) objectinput.readObject();
            objectinput.close();
            return gameState;
        }
        catch(ClassNotFoundException e)
        {
            throw new IOException("File not found");
        }
    }
}
