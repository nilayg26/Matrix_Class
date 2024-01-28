package GITHUB.Matrix_Class;
//Matrix class for 3*3 matrix
public class Matrix  {
int [][]key_matrix;
int det =0;
int cf=0;
double [][] matrix_B= new double[3][3];
public Matrix(int[][]key_matrix){
    this.key_matrix=key_matrix;
}
public double [][] inverted(){ //returns the inverted matrix in [][] format
    double[][] new_matrix=new double [3][3];
    for(int i=0;i<=2;i++){
        for(int j=0;j<=2;j++){
            new_matrix[i][j]=(((double)cofactor(i, j)/(double)determinant()));
        }
    }
    double [][] final_matrix =new double[3][3];
    for(int i=0;i<=2;i++){
        for(int j=0;j<=2;j++){
            final_matrix[i][j]=new_matrix[j][i];
        }
    }
    return final_matrix;
}
public double[][] adjoint(){ //returns the adjoint matrix in [][] format 
    double[][] new_matrix=new double [3][3];
    for(int i=0;i<=2;i++){
        for(int j=0;j<=2;j++){
            new_matrix[i][j]=(double)cofactor(i, j);
        }
    }
    return new_matrix;
}
public double [][] transpose(){ //returns the transpose matrix in [][] format
    double [][] final_matrix =new double[3][3];
    for(int i=0;i<=2;i++){
        for(int j=0;j<=2;j++){
            final_matrix[i][j]=key_matrix[j][i];
        }
    }
    return final_matrix;
}
int cofactor(int i,int j){
    cf= (key_matrix[(i+1)%3][(j+1)%3]*key_matrix[(i+2)%3][(j+2)%3])
        -(key_matrix[(i+2)%3][(j+1)%3]*key_matrix[(i+1)%3][(j+2)%3]);
    return cf;
}
public int determinant(){  //returns the determinant of the matrix in int format
    det=0;
    for(int j=0;j<3;j++){
        det=det+(key_matrix[0][j]*cofactor(0, j));
    }
    return det;
}
public int[][] add(int [][] matrix_C){
    int [][] result = new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            result[i][j]= matrix_C[i][j]+key_matrix[i][j];
        }
    }
    return result;
}
public int[][] subract(int [][] matrix_C){
    int [][] result = new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            result[i][j]= key_matrix[i][j]-matrix_C[i][j];
        }
    }
    return result;
}
public double [][] multiply(double [][] matrix_B){
    this.matrix_B=matrix_B;
    double [][] final_matrix =new double[3][3];
    for(int j=0;j<=2;j++){
        for(int i=0;i<=2;i++){
            final_matrix[i][j]=multiply_helper(i, j);
        }
    }
    return final_matrix;
}
public double [][] multiply(int [][] matrix_B){
    for (int i = 0;i<3; i++) {
        for(int j=0;j<3;j++){
        this.matrix_B[i][j] = (double)matrix_B[i][j]; // Cast each element to int
    }}
    double [][] final_matrix =new double[3][3];
    for(int j=0;j<=2;j++){
        for(int i=0;i<=2;i++){
            final_matrix[i][j]=multiply_helper(i, j);
        }
    }
    return final_matrix;
}
double multiply_helper(int i,int j){
    double element=0.0;
    for(int row=0;row<=2;row++){
        element=element+(key_matrix[i][row]*matrix_B[row][j]);
    }
    return element;
}
}
