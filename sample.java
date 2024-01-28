package GITHUB.Matrix_Class;
import java.util.Arrays;
/*this is a sample programme that displays how you can use different fucntions of this matrix class */
/*Class valid of 3*3 matrix Only. */
public class sample {
    public static void main(String [] args){
        int [][]n ={{1,0,0},{0,1,0},{0,0,1}};
        Matrix M1= new Matrix(n);
        System.out.println(Arrays.deepToString(M1.inverted()));
        System.out.println(Arrays.deepToString(M1.add(n)));
        System.out.println(Arrays.deepToString(M1.subract(n)));
        System.out.println(Arrays.deepToString(M1.adjoint()));
        int  [][]p1 ={{1,2,3},{4,5,6},{7,8,9}};
        Matrix M2= new Matrix(p1);
        System.out.println(Arrays.deepToString(M2.adjoint()));
        System.out.println(Arrays.deepToString(M1.multiply(p1)));
        System.out.println((M1.determinant()));
        
    }
}


