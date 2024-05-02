import java.io.*;
import java.util.*;
class MatrixMain
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Amalu Jose Rollno:13 Q2-Read 2 matrices from the console and perform matrix addition.date: 13-feb-24 ");
System.out.println("enter the order of matrix");
int m=in.nextInt();
int n=in.nextInt();
int matrix1[][]=new int[m][n];
int matrix2[][]=new int[m][n];
int matrix3[][]=new int[m][n];
System.out.println("enter the elements of matrix1");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
matrix1[i][j]=in.nextInt();
}
}

System.out.println("enter the elements of matrix2");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
matrix2[i][j]=in.nextInt();
}
}

for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
}
}


System.out.println("The sum of two matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(matrix3[i][j]+" ");
}
System.out.println();
}
}
}
