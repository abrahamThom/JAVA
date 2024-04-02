import java.util.Scanner;
public class SymmetricMatrix
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		 System.out.println("Name: PRINCE THOMAS \n ROLL NO: 045\nPROGRAM4: Symmetricmatrix\nDATE: 14/02/2024");
       
		System.out.println("Enter the no. of rows:");
		int rows=s.nextInt();
		System.out.println("Enter the no.of columns:");
		int cols=s.nextInt();
		int matrix[][]=new int[rows][cols];
		System.out.println("Enter the elements:");
		for(int i=0;i<rows;i++)		
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][j]=s.nextInt();
			}
		}
		s.close();
		System.out.println("Printing the matrix:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
		if(rows!=cols)
		{
			System.out.println("The matrix is not a square matrix.");
		}
		else
		{
			boolean symmetric=true;
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					if(matrix[i][j]!=matrix[j][i])
					{
						symmetric =false;
						break;
					}
				}
			}
			if(symmetric)
			{
				System.out.println("The matrix is symmetric.");
			}
			else
			{
				System.out.println("The matrix is not symmetric.");
			}
		}
	}
}
