package GITHUB.Matrix_Class;
import java.util.Arrays;
/*this is a sample programme that displays how you can use different fucntions of this matrix class */
/*Class valid of 3*3 matrix Only. */
public class sample {
    public static void main(String [] args){
        int [][]n ={{1,0,0},{0,1,0},{0,0,1}};
        Matrix M1= new Matrix(n); //initialising n as an object M1
        System.out.println(Arrays.deepToString(M1.inverted()));
        System.out.println(Arrays.deepToString(M1.add(n)));
        System.out.println(Arrays.deepToString(M1.subract(n)));
        System.out.println(Arrays.deepToString(M1.adjoint()));
        System.out.println((M1.determinant()));
        int  [][]p1 ={{1,9,31},{3,10,6},{11,8,9}};
        System.out.println(Arrays.deepToString(M1.multiply(p1)));
        Matrix M2= new Matrix(p1); //initialising p1 as an object M2
        System.out.println(Arrays.deepToString(M2.adjoint()));
        System.out.println(Arrays.deepToString(M2.add(n)));
        System.out.println(Arrays.deepToString(M2.transpose()));
        System.out.println(Arrays.deepToString(M2.multiply(M2.inverted())));
        System.out.println(M2.determinant());
    }
}


