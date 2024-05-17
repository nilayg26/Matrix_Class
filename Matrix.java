package GITHUB.Matrix_Class;
//replace the above line with:
//package Folder_Name.Matrix_Class;
//'Folder_Name' is the name of the folder
// in which you have cloned this repository. 
public class Matrix {
    private int[][] key_matrix;
    private int det;
    private int cf;
    private float[][] matrix_B;

    public Matrix(int[][] key_matrix) {//Constructor can take int [][] matrix only as input
        this.key_matrix = key_matrix;
        det = 0;
        cf = 0;
        matrix_B = new float[3][3];
    }
    public Matrix(Matrix M1){ //copy Constructor
        this.key_matrix=M1.key_matrix;
        det = 0;
        cf = 0;
        matrix_B = new float[3][3];
    }
        public int [][] getMatrix(){
            return key_matrix;
    }
    public float[][] getInverse() { // returns float[][]
        float[][] new_matrix = new float[3][3];
        int det = getDeterminant();
        if(det==0){
            System.out.println("Singular Matrix are not invertible");
            return null;
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                new_matrix[i][j] = (((float) cofactor(i, j) / (float) det));
            }
        }
        float[][] final_matrix = new float[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                final_matrix[i][j] = new_matrix[j][i];
            }
        }
        return final_matrix;
    }

    public float[][] getAdjoint() {  // returns float[][]
        float[][] new_matrix = new float[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                new_matrix[i][j] = (float) cofactor(i, j);
            }
        }
        float[][] final_matrix = new float[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                final_matrix[i][j] = new_matrix[j][i];
            }
        }
        return final_matrix;
    }

    public float[][] getTranspose() {// returns float[][]
        float[][] final_matrix = new float[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                final_matrix[i][j] = key_matrix[j][i];
            }
        }
        return final_matrix;
    }

    public int getDeterminant() { // returns int
        det = 0;
        for (int j = 0; j < 3; j++) {
            det = det + (key_matrix[0][j] * cofactor(0, j));
        }
        return det;
    }

    public float[][] add(int[][] matrix_C) { //accepts int [][] & returns float[][]
        float[][] result = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = (float) (matrix_C[i][j] + key_matrix[i][j]);
            }
        }
        return result;
    }

    public float[][] subtract(int[][] matrix_C) {//accepts int [][] & returns float[][]
        float[][] result = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = (float) (key_matrix[i][j] - matrix_C[i][j]);
            }
        }
        return result;
    }

    public float[][] add(float[][] matrix_C) {//accepts & returns float[][]
        float[][] result = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix_C[i][j] + key_matrix[i][j];
            }
        }
        return result;
    }

    public float[][] subtract(float[][] matrix_C) {//accepts & returns float[][]
        float[][] result = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = key_matrix[i][j] - matrix_C[i][j];
            }
        }
        return result;
    }

    public float[][] multiply(float[][] matrix_B) {//accepts & returns float[][]
        this.matrix_B = matrix_B;
        float[][] final_matrix = new float[3][3];
        for (int j = 0; j <= 2; j++) {
            for (int i = 0; i <= 2; i++) {
                final_matrix[i][j] = multiply_helper(i, j);
            }
        }
        return final_matrix;
    }

    public float[][] multiply(int[][] matrix_B) {//accepts int [][] & returns float[][]
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.matrix_B[i][j] = (float) matrix_B[i][j]; // Cast each element to int
            }
        }
        float[][] final_matrix = new float[3][3];
        for (int j = 0; j <= 2; j++) {
            for (int i = 0; i <= 2; i++) {
                final_matrix[i][j] = multiply_helper(i, j);
            }
        }
        return final_matrix;
    }

    private float multiply_helper(int i, int j) {
        float element = 0;
        for (int row = 0; row <= 2; row++) {
            element = element + (key_matrix[i][row] * matrix_B[row][j]);
        }
        if (Math.abs(element) < 0.001f) {
            element = 0;
        } else if (Math.abs(element) > 0.991 && Math.abs(element) < 1.001f) {
            element = 1;
        }
        return element;
    }
    private int cofactor(int i, int j) {
        cf = (key_matrix[(i + 1) % 3][(j + 1) % 3] * key_matrix[(i + 2) % 3][(j + 2) % 3])
                - (key_matrix[(i + 2) % 3][(j + 1) % 3] * key_matrix[(i + 1) % 3][(j + 2) % 3]);
        return cf;
    }
}