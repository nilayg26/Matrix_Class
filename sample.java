package GITHUB.Matrix_Class;
import java.util.Arrays;
/*this is a sample programme that displays how you can use different fucntions of this matrix class 
 Class valid for 3*3 type matrix Only.
Objects are initialised as integer matrix only, where as arguments in inbuilt functions can be passed as float or int types matrices.*/

public class sample {
    public static void main(String [] args){
        int [][]n ={{1,0,0},{0,1,0},{0,0,1}};
        Matrix M1= new Matrix(n); //initialising n as an object M1
        System.out.println(Arrays.deepToString(M1.inverted()));
        System.out.println(Arrays.deepToString(M1.add(n)));
        System.out.println(Arrays.deepToString(M1.subract(n)));
        System.out.println(Arrays.deepToString(M1.adjoint()));
        System.out.println((M1.determinant()));
        int  [][]p1 ={{9,9,3},{3,10,6},{1,8,9}};
        System.out.println(" ");
        System.out.println(Arrays.deepToString(M1.multiply(p1)));
        Matrix M2= new Matrix(p1); //initialising p1 as an object M2
        System.out.println(Arrays.deepToString(M2.adjoint()));
        System.out.println(Arrays.deepToString(M2.add(n)));
        System.out.println(Arrays.deepToString(M2.transpose()));
        System.out.println(Arrays.deepToString(M2.multiply(M2.inverted())));
        System.out.println(M2.determinant());
    }
}


