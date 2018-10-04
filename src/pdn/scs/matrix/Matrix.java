package pdn.scs.matrix;

import java.util.Scanner;

public class Matrix {
    double[][] matrix;
    int row;
    int col;
    int[] no;

    public Matrix(int row,int col){
        matrix = new double[row][col];
        this.row=row;
        this.col=col;
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter matrix value :("+i+"-"+j+") :");
                matrix[i][j]=scan.nextDouble();

            }

        }
    }

    public void print(){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(matrix[i][j]+"\t");

            }
            System.out.println("\n");

        }

    }
   public int[] getDimension(){
        no = new int[2];
        this.no[0]=matrix.length;
        this.no[1]=matrix[0].length;

        return no;


   }
    public void addMatrix(Matrix o){
        int[] r = new int[2];
        int[] x = new int[2];
        x=o.getDimension();
        r=this.getDimension();
        if(r[0]==x[0] && r[1]==x[1]){
           double[][] sum = new double[row][col];
            for (int i = 0; i <row ; i++) {
                for (int j = 0; j <col ; j++) {
                    sum[i][j]=this.matrix[i][j] + o.matrix[i][j];

                }

            }
            for (int i = 0; i <row ; i++) {
                for (int j = 0; j <col ; j++) {
                    System.out.print(sum[i][j]+"\t");

                }
                System.out.println("\n");

            }



        }
        else{
            System.out.println("two matrix have not same Dimension.\n pls enter sane dimension matrix");
        }

    }
}
