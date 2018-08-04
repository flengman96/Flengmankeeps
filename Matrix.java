import java.util.*;

public class Matrix {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
				
		
		decision();
		
		
		
		
}

	
	public static void decision() {
		int input;
		int scalar;
		
		System.out.println();
		System.out.println("what would you like to do to this Matrix:");
		System.out.println("1. Addition:");
		System.out.println("2. Subtraction:");
		System.out.println("3. Multiplication by Scalar:");
		System.out.println("4. Multiplication by another Matrix:");
		System.out.println("5. Exit:");
		System.out.print("Input:");
		
		input = scan.nextInt();
		
				switch(input){
					case 1: 
						addition(inputMatrix(), inputMatrix());
						break;
					case 2:
						subtraction(inputMatrix(), inputMatrix());
						break;
				    case 3: { System.out.print("By what scalar? ");
				    			scalar = scan.nextInt();
				    	scalarMulti(inputMatrix(), scalar);
						break;
				    }
				    case 4:
				    	matrixMulti(inputMatrix(), inputMatrix());
				    	break;
					case 5:
						break;
				}
	}
	
	
	
	
	public static double[][] inputMatrix(){
		int n;
		int m;
		
		System.out.print("Please enter the size n of the Matrix (nxm):");
		n = scan.nextInt();
		System.out.print("Please enter the size m of the Matrix (nxm):");
		m = scan.nextInt();
		
		double [][] matrix = new double[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
			System.out.print("Please enter the " +  (i+1) + "th" + " value of n and the " + (j+1) + "th value of m: ");
			matrix[i][j] = scan.nextDouble();
			}
		}
			
			int count = 0;
			System.out.println();
			System.out.println();
			
			System.out.println("    ----This is the Matrix----");
			System.out.println();
			
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print("      " + matrix[i][j] + ",");
					count = count + 1;
					if (count == m) {
						System.out.println();
						count = 0;
		}
				}
		}
		return matrix;
	}

		
		
	
	
	public static void addition(double[][] a, double[][] b) {
			
			int count = 0;
			System.out.println();
			System.out.println("    -----Matrix A-----");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					
					System.out.print("      " + a[i][j] + ",");
					count = count + 1;
					if (count == a.length) {
						System.out.println();
						count = 0;
					}
				}
			}
			System.out.println();
			System.out.println("    -----Matrix B-----");
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b.length; j++) {
					
					System.out.print("      " + b[i][j] + ",");
					count = count + 1;
					if (count == b.length) {
						System.out.println();
						count = 0;
					}
				}
			}
			System.out.println();
			
			System.out.println("This is the Result of the Matrix Addition of the two matrices: ");
			System.out.println();
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					a[i][j] = a[i][j] + b[i][j];
					System.out.print("      " + a[i][j] + ",");
					count = count + 1;
					if (count == a.length) {
						System.out.println();
						count = 0;
					}
				}
			}
		decision();	
		}
	
	public static void subtraction(double[][] a, double[][] b) {
		
		int count = 0;
		System.out.println();
		System.out.println("    -----Matrix A-----");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				System.out.print("      " + a[i][j] + ",");
				count = count + 1;
				if (count == a.length) {
					System.out.println();
					count = 0;
				}
			}
		}
		System.out.println();
		System.out.println("    -----Matrix B-----");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				
				System.out.print("      " + b[i][j] + ",");
				count = count + 1;
				if (count == b.length) {
					System.out.println();
					count = 0;
				}
			}
		}
		System.out.println();
		
		System.out.println("This is the Result of the Matrix Subtraction of the two matrices: ");
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = a[i][j] - b[i][j];
				System.out.print("      " + a[i][j] + ",");
				count = count + 1;
				if (count == a.length) {
					System.out.println();
					count = 0;
				}
			}
		}
	decision();	
	}
	
public static void scalarMulti(double[][] a, int number) {
		
		int count = 0;
		System.out.println();
		System.out.println("    -----Matrix A-----");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				System.out.print("      " + a[i][j] + ",");
				count = count + 1;
				if (count == a.length) {
					System.out.println();
					count = 0;
				}
			}
		}
		
		System.out.println("This is the Result of the Matrix scalar multiplication is: ");
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = a[i][j] * number;
				System.out.print("      " + a[i][j] + ",");
				count = count + 1;
				if (count == a.length) {
					System.out.println();
					count = 0;
				}
			}
		}
	decision();	
	}
	
	public static void matrixMulti(double[][] a, double[][] b) {
		
		int count = 0;
		System.out.println();
		System.out.println("    -----Matrix A-----");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				System.out.print("      " + a[i][j] + ",");
				count = count + 1;
				if (count == a.length) {
					System.out.println();
					count = 0;
				}
			}
		}
		System.out.println();
		System.out.println("    -----Matrix B-----");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				
				System.out.print("      " + b[i][j] + ",");
				count = count + 1;
				if (count == b.length) {
					System.out.println();
					count = 0;
				}
			}
		}
		System.out.println();
		
		System.out.println("This is the Result of the Matrix multiplication of the two matrices: ");
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = a[i][j] * b[j][i];
				System.out.print("      " + a[i][j] + ",");
				count = count + 1;
				if (count == a.length) {
					System.out.println();
					count = 0;
				}
			}
		}
	decision();	
	}
}