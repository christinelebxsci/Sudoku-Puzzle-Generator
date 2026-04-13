# Sudoku-Puzzle-Generator
Project title: Sudoku Puzzle Generator

Student name: Christine Le

Short description: This project generates a board of a solved Sudoku puzzle with 9 boxes.

How to run the program:
1. Create a codespace.
2. From the three lines icon, go to Terminal and create a new terminal.
3. Install "Extension Pack for Java" from the Extensions icon.
4. Once it is installed, go to the Run and Debug icon, and open the file SudokuGenerator.java to be run. Hit "Run and Debug."
6. In the bottom right corner, a prompt will ask to switch the Java language server to Standard mode. Click "Yes."
7. In the terminal, the solved Sudoku puzzle will appear.
8. Hit "Run and Debug" as many times as desired to keep generating more Sudoku puzzles. 

Methodology summary:

The program generates 9 strings that has the numbers 1-9 uniquely appear in a random order, which forms the rows of the puzzle. As it generates these strings, it checks to make sure that no number appears in the same column twice, and that each number is unique for every box of the Sudoku puzzle. If a string violates either of these rules, discard it, and generate a new one in its place until it is valid. When all 9 valid rows have been generated, they are sorted into a 2D array to represent the Sudoku puzzle and printed with proper decoration and formatting.

List of files included in the project:
 - README.md
 - SudokuGenerator.java
 - DesignDocument.pdf
