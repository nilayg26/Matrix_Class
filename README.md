# Matrix 3*3 Class

## Overview
The **Java Matrix Class** provides a comprehensive set of operations and functions for manipulating **3x3 matrices**. It includes essential matrix operations such as inversion, determinant calculation, adjoint computation, and more.

## Features
- **Matrix Inversion**: Compute the inverse of a 3x3 matrix.
- **Determinant Calculation**: Find the determinant of a given matrix.
- **Adjoint Computation**: Compute the adjugate (adjoint) of a matrix.
- **Matrix Multiplication**: Multiply two 3x3 matrices.
- **Transpose Operation**: Get the transpose of a matrix.
- **Scalar Multiplication**: Multiply a matrix by a scalar.
- **Identity Matrix Check**: Verify if a matrix is an identity matrix.
- **Matrix Addition & Subtraction**: Perform element-wise matrix addition and subtraction.

## Usage
To use this class, simply instantiate a `Matrix` object and call the available methods:

```java
int[][] matrixData = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
Matrix matrix = new Matrix(matrixData);
int[][] keyMatrix = matrix.getMatrix();
int determinant = matrix.getDeterminant();
float[][] inverseMatrix = matrix.getInverse();
float[][] adjointMatrix = matrix.getAdjoint();
float[][] transposeMatrix = matrix.getTranspose();

int[][] matrixB = {
    {2, 4, 6},
    {8, 10, 12},
    {14, 16, 18}
};


float[][] sumMatrix = matrix.add(matrixB);
float[][] diffMatrix = matrix.subtract(matrixB);
float[][] productFloatMatrix = matrix.multiply(floatMatrix);


