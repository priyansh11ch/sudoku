# sudoku solver
I have created a comprehensive Sudoku Solver application using Java, incorporating DSA concepts like Backtracking and Hashing, alongside JavaFX for a user-friendly GUI. 
I have utilized the Java Collection Framework and handled game data persistence through local storage. 
Here's a quick overview of the components:

## SudokuBuildLogic Class
Handles the setup of the game logic and UI, including loading or generating a new game state.

## GameGenerator Class 
Generates a new Sudoku grid, including solving and "unsolving" the puzzle to create a playable state.

## SudokuSolver Class
Uses backtracking to check if a puzzle is solvable, a key part of ensuring generated puzzles are valid.

## SudokuUtilities Class
Provides utility methods to copy grid arrays and manage Sudoku grids.

## GameState Enum
Defines the states of the game (e.g., COMPLETE, ACTIVE, NEW).

## Messages Enum
Contains message constants used for UI prompts.

## Coordinates Class
Represents grid coordinates and handles equality checks.

## Game Class
Manages the game state and grid, implementing serialization for persistent storage.

## IStorage Interface
Defines methods for updating and retrieving game data from storage.

## SudokuApplication Class
The main class that launches the JavaFX application.

## LocalStorageImpl Class
Implements the IStorage interface to handle local file storage of game data.

## ControlLogic Class
Manages user input and game logic, updating the game state based on player moves.

## interface_impl Class
Implements the user interface, handling key events and updating the board.

## IUserInterfaceContract Interface
Defines methods for the user interface and event handling.

# Concepts Used in the Sudoku Solver Application

## Backtracking:
Backtracking is an algorithmic technique used for solving problems incrementally, by trying to build a solution piece by piece and removing solutions that fail to satisfy the constraints of the problem at any point (i.e., backtracking).
Use: The Sudoku solver uses backtracking to try out different numbers in each cell. If a number is placed and later found to lead to a contradiction, the algorithm backtracks and tries a different number.

## Hashing:
Hashing is a technique used to uniquely identify objects from a set by converting them into a hash code, a numeric value. This is commonly used in data structures like hash tables to allow fast access to data.
Use: Hashing can be employed to quickly check if a number has already been used in a particular row, column, or sub-grid, enhancing the efficiency of the solution.

## Java Collection Framework:
The Java Collection Framework provides a set of classes and interfaces that implement commonly reusable collection data structures, like lists, sets, and maps.
Use: You might use collections such as HashSet to store and manage the numbers placed in rows, columns, and sub-grids, ensuring no duplicates are present.

InputStreamReader and OutputStreamReader:
InputStreamReader and OutputStreamReader are Java classes used to read and write data in character streams, bridging byte streams and character streams.
Use: These classes can be used to handle input and output operations, such as reading a Sudoku puzzle from a file or user input, and displaying the solution.

JavaFX-SDK GUI:
JavaFX is a software platform used for creating and delivering desktop applications, as well as rich internet applications that can run across a wide variety of devices. JavaFX provides a set of graphics and media packages for creating visually rich user interfaces.
Use: JavaFX-SDK is used to create a graphical user interface for the Sudoku solver, allowing users to interact with the application in a more intuitive and user-friendly way.
