public class SudokuGenerator{
  public static void main(String[] args){
    // array of all the boards
  }

  // generate a sudoku board
  public static int[][] generate(){
    int[][] result = new int[3][3];
    int[] numbers = new int[10];
    int[] values = new int[9];
    for (int i = 0; i < values.length; i++){
      int num = (int)(Math.random() * 9 + 1);
      while (numbers[num] != 0){
        num = (int)(Math.random() * 9 + 1);
      }
      numbers[num]++;
      values[i] = num;
    }
    int count = 0;
    for (int i = 0; i < result.length; i++){
      for (int j = 0; j < result[0].length; j++){
        result[i][j] = values[count];
        count++;
      }
    }
    return result;
  }

  // compare method

  // print out the board in a good way
  public static void board(){
  }
}
