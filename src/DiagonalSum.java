import java.util.Scanner; // Import Scanner for user input

public class DiagonalSum { // Main class definition
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
    }
}
        // Prompt user to enter the size of the matrix
        System.out.print("Enter size of matrix: ");
        int size = scanner.nextInt(); // Read the size of the square matrix

        // Create a 2D array to hold the matrix elements
        int[][] matrix = new int[size][size]; // Initialize matrix based on size
        // Prompt the user to enter the elements row by row
        System.out.println("Enter elements row by row:");
        for (int i = 0; i < size; i++) { // Loop through rows
            for (int j = 0; j < size; j++) { // Loop through columns
                matrix[i][j] = scanner.nextInt(); // Read each element
            }
        }
        // Calculate the sums of the main and secondary diagonals
        int mainDiagonalSum = 0; // Initialize sum for main diagonal
        int secondaryDiagonalSum = 0; // Initialize sum for secondary diagonal

        for (int i = 0; i < size; i++) {
            mainDiagonalSum += matrix[i][i]; // Add elements of the main diagonal
            secondaryDiagonalSum += matrix[i][size - 1 - i]; // Add elements of the secondary diagonal
        }
