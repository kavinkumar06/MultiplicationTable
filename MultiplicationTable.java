# MultiplicationTable
import java.io.*;
import java.util.*;
public class MultiplicationTable
{
  public static void main(String args[])
  {
    int a,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an integer to generate N*N multiplication table");
    int n=sc.nextInt();
    int a[][]=new int[n][n];
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {
        a[i-1][j-1]=i*j;
        }
        }
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
         System.out.println(a[i][j]+" ");
         }
         System.out.println();
         }
        sc.close();
        }
       } 
