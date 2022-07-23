// Better Solution

import java.util.*;
class Main{
    public static void main (String[] args) {
       int matrix[][]= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
       setMatrix(matrix);
       System.out.println("new matrix");
       for(int i = 0; i < matrix.length; i++)
       {
           for(int j = 0; j < matrix[i].length; j++)
           System.out.print(matrix[i][j]+" ");
           System.out.println();
       }
    }
    public static void setMatrix(int matrix[][])
    {
        int rows = matrix.length,col = matrix[0].length;
        int r[] = new int[rows];
        int c[] = new int[col];
        Arrays.fill(r,-1);
        Arrays.fill(c,-1);
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(matrix[i][j]==0)
                {
                    r[i] = 0;
                    c[j] = 0;
                }
            }
        }
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(r[i] == 0 || c[j] == 0)
                matrix[i][j] =0;
            }
        }
    }
}




// Optimized Solution

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int matr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setMat(matr);
        System.out.println("matrix is");
        for (int i = 0; i < matr.length; i++) {
            for(int j = 0 ; j < matr[0].length;j++)
            System.out.print(matr[i][j]);
            System.out.println();  
        }
        
    }
    public static void setMat(int matrix[][])
    {
        int col0 = 1, row = matrix.length, col = matrix[0].length;
        for(int i = 0; i < row; i++)
        {
            if(matrix[i][0]==0) 
            col0 = 1;
            for(int j =1; j < col ; j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0] = matrix[0][j]=0;
                }
            }
        }
        for(int i = row-1; i >=0; i--)
        {
            for(int j = col-1; j >=0; j--)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
                if(col0 == 0) 
                matrix[i][0] = 0;
            }
        }
    }
}
