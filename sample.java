package GITHUB.Matrix_Class;
import java.util.Arrays;
/*this is a sample programme that how you can use different fucntions of this matrix class */
public class sample {
    public static void main(String [] args){
        int [][]n ={{1,0,0},{0,1,0},{0,0,1}};
        Matrix M1= new Matrix(n);
        System.out.println(Arrays.deepToString(M1.inverted()));
        System.out.println(Arrays.deepToString(M1.add(n)));
        System.out.println(Arrays.deepToString(M1.subract(n)));
        System.out.println(Arrays.deepToString(M1.adjoint()));
        double [][]p2 ={{1,2,3},{4,5,6},{7,8,9}};
        int  [][]p1 ={{1,2,3},{4,5,6},{7,8,9}};
        Matrix M2= new Matrix(p1);
        System.out.println(Arrays.deepToString(M2.adjoint()));
        System.out.println(Arrays.deepToString(M1.multiply(p2)));
        System.out.println((M1.determinant()));
    }
}


