package ConditionalsAndRepetitions;

import java.util.Arrays;

public class For {
	public static void main(String[] args) {
		
		String[][] matrix = new String[5][9];		
		float middleOfMatrix = (float) Math.floor(9 / 2f);
		byte left = (byte) middleOfMatrix;
		byte right = (byte) middleOfMatrix;
		
		for (int row = 0; row <= middleOfMatrix; row += 1) {
			for (int column = 0; column < 9; column += 1) {
				if (row == 0 && column == middleOfMatrix) {
					matrix[row][column] = "X";
				} else if (
						(column == left || column == right || row == 4)
						&& row != 0)
				{
					matrix[row][column] = "X";
				} else {
					matrix[row][column] = " ";
				}
			}
			left -= 1;
			right += 1;
		}
		
		for (int i = 0; i < matrix.length; i += 1) {
			for (int j = 0; j < matrix[i].length; j += 1) {
				System.out.print(matrix[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("\nVisualização da matriz:");
		for (int i = 0; i < matrix.length; i += 1) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
