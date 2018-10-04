package pdn.scs;

import pdn.scs.matrix.Matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of row:");
        int row=scan.nextInt();
        System.out.print("Enter no of col:");
        int col=scan.nextInt();

        Matrix m1= new Matrix(row,col);
        m1.print();
        System.out.print("Enter second matrix no of row :");
        int m = scan.nextInt();
        System.out.print("Enter second matrix no of col :");
        int n = scan.nextInt();

        m1.addMatrix(new Matrix(m,n));

    }
}
