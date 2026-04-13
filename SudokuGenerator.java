public class SudokuGenerator{
    public static String[] rows = new String[9];
    public static int[][] board = new int[9][9];
    public static void main(String[] args){
        for (int i = 0; i < rows.length; i++){
            String row = "";
            boolean valid = false;
            while (!valid){
                row = generateRow();
                valid = check(row, i);
            }
            rows[i] = row;
        }
        insert();
        display();
    }
    
    public static String generateRow(){
        int[] bank = new int[10];
        String result = "";
        for (int i = 0; i < 9; i++){
            boolean unique = false;
            while (!unique){
                int random = (int)(Math.random() * 9 + 1);
                if (bank[random] == 0){
                    unique = true;
                    bank[random]++;
                    result += "" + random;
                }
            }
        }
        return result;
    }
    
    public static boolean check(String row, int pos){
        for (int i = 0; i < row.length(); i++){
            for (int j = 0; j < pos; j++){
                if (row.charAt(i) == rows[j].charAt(i)){
                    return false;
                }
                
                // If the newest row is not the start of a block (0, 3, 6),
                // and the current row to compare against is part of the same block
                if (pos%3 != 0 && j >= pos - pos%3){
                    int blockStart = (i/3) * 3;
                    int blockNext = blockStart + 3;
                    // If a number appears more than once in a singular block
                    if (blockStart <= rows[j].indexOf(row.charAt(i)) && rows[j].lastIndexOf(row.charAt(i)) < blockNext){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static void insert(){
        String nums = "";
        for (String str : rows){
            nums += str;
        }
        
        int index = 0;
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                board[i][j] = Integer.parseInt("" + nums.charAt(index));
                index++;
            }
        }
    }
    
    public static void display(){
        for (int i = 0; i < board.length; i++){
            if (i%3 == 0){
                System.out.println("-------------------------");
            }
            for (int j = 0; j < board[0].length; j++){
                if (j%3 == 0){
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("-------------------------");
    }
}
