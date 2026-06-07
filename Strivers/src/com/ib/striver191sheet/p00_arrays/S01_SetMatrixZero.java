package com.ib.striver191sheet.p00_arrays;

/**
 * Set Matrix Zero
 *
 * Problem Statement: Given a matrix if an element in the matrix is 0 then
 * you will have to set its entire column and row to 0 and then return the matrix..
 *
 * Example:
 * Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 * Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.
 *
 * Input: matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 * Explanation:Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0
 */
public class S01_SetMatrixZero {

    /**
     * Time Complexity: O(m * n * (m + n)), We iterate through every cell (m * n), and for each zero,
     *  we potentially mark its entire row (O(n)) and column (O(m)), leading to O(m * n * (m + n)) overall.
     * Space Complexity: O(1), We are not using any extra data structures, only modifying the matrix in place (apart from a few variables).
     * @param matrix
     * @return
     */
    public int[][] setMatrixZero(int[][] matrix){
        int m = matrix.length; //row
        int n = matrix[0].length; //col

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    // Zero out column j
                    // fix the column j and very the row
                    for(int row=0; row<m; row++){
                        if(matrix[row][j] != 0)
                            matrix[row][j] = -1;
                    }

                    // Zero out row i
                    for(int col=0; col<n; col++){
                        if(matrix[i][col] != 0)
                            matrix[i][col] = -1;
                    }
                }
            }
        }
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]==-1)
                    matrix[i][j] = 0;
            }
        }
        return matrix;
    }

    /**
     * Time Complexity: O(m × n),We make two passes over the matrix.First pass to identify rows and columns to be zeroed (O(m × n)).
     * Second pass to update the matrix using the markers (O(m × n)).Total time is proportional to the number of cells in the matrix, so O(m × n).
     * Space Complexity: O(m + n),We store two extra arrays one for m rows and one for n columns. No other extra space is used besides these arrays.
     * @param matrix
     * @return
     */
    public int[][] setMatrixZero1(int[][] matrix) {
        int m = matrix.length; //row
        int n = matrix[0].length; //col

        int[] rowmat = new int[m];
        int[] colmat = new int[n];

        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowmat[i] = 1;
                    colmat[j] = 1;
                }
            }
        }

        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if(rowmat[i] == 1 || colmat[j] == 1)
                    matrix[i][j] = 0;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        S01_SetMatrixZero s = new S01_SetMatrixZero();
        // Example matrix
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] mat2 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        // Modify matrix
        s.setMatrixZero1(mat2);

        // Print result
        for (int[] row : mat2) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

