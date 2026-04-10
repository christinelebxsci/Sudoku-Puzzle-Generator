# Sudoku-Puzzle-Generator
Project: Sudoku Puzzle Generator

Christine Le

This project generates a board of 9 solved Sudoku puzzles.

How to run the program??? Um

The program generates 9 strings that has the numbers 1-9 uniquely appear in a random order, which forms the rows of the puzzle. As it generates these strings, it checks to make sure that no number appears in the same column twice, and that each number is unique for every box of the Sudoku puzzle. If a string violates either of these rules, discard it, and generate a new one in its place until it is valid. When all 9 valid rows have been generated, they are sorted into a 2D array to represent the Sudoku puzzle and printed with proper decoration and formatting.

List of files included in the project:
 - README.md
 - SudokuGenerator.java
 - DesignDocument.pdf
