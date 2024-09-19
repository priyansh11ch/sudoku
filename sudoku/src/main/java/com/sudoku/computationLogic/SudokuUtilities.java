package com.sudoku.computationLogic;

import com.sudoku.org.example.Game;

public class SudokuUtilities
{
    public static void copySudokuArrayValues(int[][] oldArray,int[][] newArray)
   {
    for(int xIndex = 0; xIndex< Game.GRID_BOUNDARY; xIndex++)
    {
        for(int yIndex = 0; yIndex< Game.GRID_BOUNDARY; yIndex++)
        {
            newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
        }
    }
   }

   public static int[][] copyToNewArray(int[][] oldArray)
   {
       int[][] newArray = new int[Game.GRID_BOUNDARY][Game.GRID_BOUNDARY];

       for(int xIndex = 0; xIndex< Game.GRID_BOUNDARY; xIndex++)
       {
           for(int yIndex = 0; yIndex< Game.GRID_BOUNDARY; yIndex++)
           {
               newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
           }
       }
       return newArray;
   }
}
