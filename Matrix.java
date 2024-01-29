package GITHUB.Matrix_Class;
//Matrix class for 3*3 matrix
public class Matrix{
int [][]key_matrix;
int det =0;
int cf=0;
float [][] matrix_B= new float[3][3];
public Matrix(int[][]key_matrix){
    this.key_matrix=key_matrix;
}
public float [][] inverted(){ //returns the inverted matrix in [][] format
    float[][] new_matrix=new float [3][3];
    int det= determinant();
    for(int i=0;i<=2;i++){
        for(int j=0;j<=2;j++){
            new_matrix[i][j]=(((float)cofactor(i, j)/(float)det));
        }
    }
    float [][] final_matrix =new float[3][3];
    for(int i=0;i<=2;i++){
        for(int j=0;j<=2;j++){
            final_matrix[i][j]=new_matrix[j][i];
        }
    }
    return final_matrix;
}
public float[][] adjoint(){ //returns the adjoint matrix in [][] format 
    float[][] new_matrix=new float [3][3];
    for(int i=0;i<=2;i++){
        for(int j=0;j<=2;j++){
            new_matrix[i][j]=(float)cofactor(i, j);
        }
    }
    float [][] final_matrix =new float[3][3];
    for(int i=0;i<=2;i++){
        for(int j=0;j<=2;j++){
            final_matrix[i][j]=new_matrix[j][i];
        }
    }
    return final_matrix;
}
public float [][] transpose(){ //returns the transpose matrix in [][] format
    float [][] final_matrix =new float[3][3];
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
public float[][] add(int [][] matrix_C){
    float [][] result = new float[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            result[i][j]= (float)(matrix_C[i][j]+key_matrix[i][j]);
        }
    }
    return result;
}
public float[][] subract(int [][] matrix_C){
    float [][] result = new float[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            result[i][j]= (float)(key_matrix[i][j]-matrix_C[i][j]);
        }
    }
    return result;
}
public float[][] add(float [][] matrix_C){
    float [][] result = new float[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            result[i][j]= matrix_C[i][j]+key_matrix[i][j];
        }
    }
    return result;
}
public float[][] subract(float [][] matrix_C){
    float [][] result = new float[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            result[i][j]= key_matrix[i][j]-matrix_C[i][j];
        }
    }
    return result;
}
public float [][] multiply(float [][] matrix_B){
    this.matrix_B=matrix_B;
    float [][] final_matrix =new float[3][3];
    for(int j=0;j<=2;j++){
        for(int i=0;i<=2;i++){
            final_matrix[i][j]=multiply_helper(i, j);
        }
    }
    return final_matrix;
}
public float [][] multiply(int [][] matrix_B){
    for (int i = 0;i<3; i++) {
        for(int j=0;j<3;j++){
        this.matrix_B[i][j] = (float)matrix_B[i][j]; // Cast each element to int
    }}
    float [][] final_matrix =new float[3][3];
    for(int j=0;j<=2;j++){
        for(int i=0;i<=2;i++){
            final_matrix[i][j]=multiply_helper(i, j);
        }
    }
    return final_matrix;
}
float multiply_helper(int i,int j){
    float element=0;
    for(int row=0;row<=2;row++){
        element=element+(key_matrix[i][row]*matrix_B[row][j]);
    }
    if(Math.abs(element)<0.001f){
        element=0;
    }
    else if(Math.abs(element)<1.001f){
        element=1;
    }
    return element;
}
}