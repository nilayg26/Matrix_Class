package GITHUB.Matrix_Class; //remove this line before running the code
//Add the following line of code at the beginning, when using the Matrix class in different folders/files
//import Folder_Name.Matrix_Class.Matrix;
//'Folder_Name' is the name of the folder
// in which you have cloned this repository.

/*this is a sample programme that displays how you can use different fucntions of this matrix class 
 Class valid for 3*3 type matrix Only.
Objects are initialised as integer matrix only, where as arguments in inbuilt functions can be passed as float or int types matrices.
Output is given as float type 2D array. 
Arrays.deepToString() Returns a string representation of the "deep contents" of a multidimensional array*/
import java.util.Arrays;
public class sample {
    public static void main(String [] args){
        int [][]n ={{1,0,0},{0,1,0},{0,0,1}};
        Matrix M1= new Matrix(n); //initialising n as an object M1
        System.out.println(Arrays.deepToString(M1.inverse()));
        System.out.println(Arrays.deepToString(M1.add(n)));
        System.out.println(Arrays.deepToString(M1.subtract(n)));
        System.out.println(Arrays.deepToString(M1.adjoint()));
        System.out.println((M1.determinant()));
        int  [][]p1 ={{9,9,3},{3,10,6},{1,8,9}};
        System.out.println(" ");
        System.out.println(Arrays.deepToString(M1.multiply(p1)));
        Matrix M2= new Matrix(p1); //initialising p1 as an object M2
        System.out.println(Arrays.deepToString(M2.adjoint()));
        System.out.println(Arrays.deepToString(M2.add(n)));
        System.out.println(Arrays.deepToString(M2.transpose()));
        System.out.println(Arrays.deepToString(M2.multiply(M2.inverse())));
        System.out.println(M2.determinant());
    }
}


