package leetCode_medium;
/*
 	36. Valid Sudoku
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:
A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.

Example 1:

Input: board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
Example 2:

Input: board = 
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 */
public class Q36 {
	public static void main(String[] args) {

		String[][] board = 
			{{"5","3",".",".","7",".",".",".","."}
			,{"6",".",".","1","9","5",".",".","."}
			,{".","9","8",".",".",".",".","6","."}
			,{"8",".",".",".","6",".",".",".","3"}
			,{"4",".",".","8",".","3",".",".","1"}
			,{"7",".",".",".","2",".",".",".","6"}
			,{".","6",".",".",".",".","2","8","."}
			,{".",".",".","4","1","9",".",".","5"}
			,{".",".",".",".","8",".",".","7","9"}} ;

		boolean flag = checkBoard(board);
		
		System.out.println(flag ? "Board is Valid" : "Board is invalid");
		
	}
	//CheckBoard
	private static boolean checkBoard(String[][] board)
	{
		return checkAllRows(board) && checkAllColumns(board) && checkAllGrids(board) ;
	}
	//For rows
	private static boolean checkAllRows(String[][] board)
	{
		for (int i = 0; i < 9; i++) 
		{
			if(toCheckRow(board , i))
			{
				continue ;
			}
			else
			{
				return false ;
			}
		}
		return true ;
	}

	private static boolean toCheckRow(String[][] board , int row)
	{
		int count = 0 ;

		for (int i = 0; i < 9; i++) 
		{	count = 0 ;
		if(!(board[row][i].equals(".")))
		{	
			for (int j = 0; j < board.length; j++) 
			{

				if(board[row][j].equals("."))
				{		
					continue ;
				}
				else if(board[row][i].equals(board[row][j]))
				{
					count++ ;
					if(count == 2)
					{
						return false ;
					}
				}
			}
		}
		}
		return true ;
	}

	//Check columns
	private static boolean checkAllColumns(String[][] board)
	{
		for (int i = 0; i < board.length; i++) {
			if(toCheckColumn(board,i))
			{
				continue;
			}
			else
			{
				return false ;
			}
		}
		return true ;
	}
	private static boolean toCheckColumn(String[][] board, int column)
	{
		int count = 0 ;
		for (int i = 0; i < board.length; i++) {
			count = 0 ;
			if(!(board[i][column].equals(".")))
			{
				for (int j = 0; j < board.length; j++) {
					if(board[i][column].equals("."))
					{
						continue;
					}
					else if(board[i][column].equals(board[j][column]))
					{
						count++ ;
						if(count == 2)
						{
							return false ;
						}
					}
				}
			}
		}
		return true;
	}

	//check Grids
	private static boolean checkAllGrids(String[][] board)
	{
		for (int i = 0; i < board.length; i+=3) {
			for (int j = 0; j < board.length; j+=3) 
			{
				if(checkingGrid(board,i,j))
				{
					continue;
				}
				else
				{
					return false ;
				}
			}
		}
		return true ;
	}

	private static boolean checkingGrid(String[][] board , int row , int column)
	{
		int count = 0;

		for (int i = row; i < row+3 ; i++) 
		{
			for (int j = column; j < column +3; j++) {
				count = 0 ;
				if(!(board[i][j].equals(".")))
				{
					for (int j2 = row; j2 < row+3; j2++) {
						for (int k = column; k < column+3; k++) {

							if(board[j2][k].equals("."))
							{
								continue;
							}
							else if(board[i][j].equals(board[j2][k]))
							{
								count++;
								if(count==2)
								{
									return false ;
								}
							}

						}
					}
				}
			}
		}
		return true ;
	}
}
