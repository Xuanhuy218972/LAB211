package j1.s.p0074.object;
import j1.s.operation.Validator;
public class Matrix {

    private int[][] matrix;

    public Matrix() {
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getRow() {
        return matrix.length;
    }

    public int getCol() {
        return matrix[0].length;
    }

    public int getIndex(int i, int j) {
        return matrix[i][j];
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public void inputMatrix(String msg) {
        int row = Validator.checkNum("Enter row " + msg);
        int column = Validator.checkNum("Enter column " + msg);
        matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = Validator.checkNum("Enter " + msg + "[" + (i + 1) + "][" + (j + 1) + "]");
                //matrix[i][j] = Validation.getInt(String.format("Enter %s[%d][%d]:", msg, i + 1, j + 1));
            }
        }
    }

    public void additionMatrix(Matrix matrix) {
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getCol(); j++) {
                this.matrix[i][j] += matrix.getIndex(i, j);
            }
        }
    }

    public void subtractionMatrix(Matrix matrix) {
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getCol(); j++) {
                this.matrix[i][j] -= matrix.getIndex(i, j);
            }
        }
    }

    public void multiplicationMatrix(Matrix matrix) {
        int[][] result = new int[this.matrix.length][matrix.getCol()];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < this.matrix[0].length; k++) {
                    result[i][j] += this.matrix[i][k] * matrix.getIndex(k,j);
                }
            }
        }
         this.matrix  = result;
    }
}

