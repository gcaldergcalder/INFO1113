import java.util.Scanner;

public class MatrixMult {
    
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a_cols = scan.nextInt();
        int a_rows = scan.nextInt();
        int b_cols = scan.nextInt();
        int b_rows = scan.nextInt();

        // int[][] output = new int[a_cols][b_rows];
        int[][] matrix_a = new int[a_rows][a_cols];
        int[][] matrix_b = new int[b_rows][b_cols];

        for (int i = 0; i < matrix_a.length; i++) {
            for (int j = 0; j < matrix_a[0].length; j++) {
                matrix_a[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < matrix_b.length; i++) {
            for (int j = 0; j < matrix_b[0].length; j++) {
                matrix_b[i][j] = scan.nextInt();
            }
        }

        // System.out.println("Input logs: ");
        // System.out.println(a_cols);
        // System.out.println(a_rows);
        // System.out.println(b_cols);
        // System.out.println(b_rows);

        try {
            int[][] output = multiply(matrix_a, matrix_b);

            for (int i = 0; i < output.length; i++) {
                for (int j = 0; j < output[0].length; j++) {
                    if (j == (output[0].length - 1)) {
                        System.out.print(output[i][j]);
                    } else {
                        System.out.print(output[i][j] + " ");
                    }
                    
                }
                System.out.println();
            }

        } catch (NullPointerException e) {
            
        }
        


        // int[][] test_matrix_a = {{5, 3, 10},
        //                     {7, 9, 9}};
        // int[][] test_matrix_b = {{10, 2, 3, 8, 12},
        //                     {7, 4, 11, 3, 6},
        //                     {8, 8, 1, 14, 3}};

        // int[][] multiplied = multiply(test_matrix_a, test_matrix_b);

        // for (int i = 0; i < multiplied.length; i++) {
        //     for (int j = 0; j < multiplied[0].length; j++) {
        //         System.out.print(multiplied[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
    
    
    public static int[][] multiply(int[][] a, int[][] b) {
        
        // figuring out what an empty matrix is
        if (a.length == 0 && b.length == 0) {
            System.out.println("0");
            return null;
        }
        
        // number of cols for matrix a must be equal to rows in matrix b
        if (a[0].length != b.length) {
            System.out.println("Invalid input.");
            return null;
        }
        
        // Initialise a matrix with number of rows of a, number of cols of b
        int[][] res = new int[a.length][b[0].length];

        // iterate over each row of the matrix
        for (int row = 0; row < a.length; row++) {
            // iterate over each column of the matrix
            for (int col = 0; col < b[0].length; col++) {
                // we can now compute and assign the value for this element of the matrix
                int val = 0;
                // iterator i is the length of cols in matrix a, and rows in matrix b
                // if they were not equal, the initial check should return null and we never reach this point
                // since they are equal, we can iterate over both matrixes simultaneously
                for (int i = 0; i < a[0].length; i++) {
                    val += (a[row][i] * b[i][col]);
                    // when this loop is complete, we have the value for this row & col of the result matrix
                }
                res[row][col] = val;
            }
        }
        return res;
    }
}