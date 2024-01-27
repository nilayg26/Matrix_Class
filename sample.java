package GITHUB.Matrix_Class;
import java.util.Arrays;
public class sample {
    public static void main(String [] args){
        int [][]n ={{1,0,0},{0,1,0},{0,0,1}};
        Matrix M1= new Matrix(n);
        System.out.println(Arrays.deepToString(M1.inverted()));
        System.out.println(Arrays.deepToString(M1.add(n)));
        System.out.println(Arrays.deepToString(M1.subract(n)));
        double [][]p ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(M1.multiply(p)));
        System.out.println((M1.determinant()));
    }
}


