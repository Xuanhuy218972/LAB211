package j1.s.p0074.controller;

import j1.s.p0074.object.Matrix;

public class Caculator {
    private Matrix matrixOne;
    private Matrix matrixTwo;

    public Caculator() {
        matrixOne = new Matrix();
        matrixTwo = new Matrix();
    }

    public void additionMatrix() {
        System.out.println("----Addition----");
        matrixOne.inputMatrix("Matrix 1");
        matrixTwo.inputMatrix("Matrix 2");

        if (matrixOne.getRow() == matrixTwo.getRow() && matrixOne.getCol() == matrixTwo.getCol()) {
            matrixOne.printMatrix();
            System.out.println("+");
            matrixTwo.printMatrix();
            System.out.println("=");

            matrixOne.additionMatrix(matrixTwo);
            matrixOne.printMatrix();
        } else {
            System.out.println("Cannot add matrices with different dimensions");
        }
    }

    public void subtractionMatrix() {
        System.out.println("----Subtraction----");
        matrixOne.inputMatrix("Matrix 1");
        matrixTwo.inputMatrix("Matrix 2");

        if (matrixOne.getRow() == matrixTwo.getRow() && matrixOne.getCol() == matrixTwo.getCol()) {
            matrixOne.printMatrix();
            System.out.println("-");
            matrixTwo.printMatrix();
            System.out.println("=");
            matrixOne.subtractionMatrix(matrixTwo);
            matrixOne.printMatrix();
        } else {
            System.out.println("Cannot subtract matrices with different dimensions");
        }
    }

    public void multiplicationMatrix() {
        System.out.println("----Multiplication----");
        matrixOne.inputMatrix("Matrix 1");
        matrixTwo.inputMatrix("Matrix 2");
        System.out.println("----Results----");

        if (matrixOne.getCol() == matrixTwo.getRow()) {
            matrixOne.printMatrix();
            System.out.println("*");
            matrixTwo.printMatrix();
            System.out.println("=");
            matrixOne.multiplicationMatrix(matrixTwo);
            matrixOne.printMatrix();
        } else {
            System.out.println("Column of matrix1 must equal Row of matrix2");
        }
    }
}
