import java.util.Scanner;
public class testr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int arr[][] = new int [3][3];
System.out.println("Enter some values: ");
for(int x = 0;x<3;x++) {
  for (int y = 0;y<3;y++) {
	  arr [x][y] = scan.nextInt();

	}
	}
System.out.println(" Here  is  the  matrix");
for (int x = 0;x<3;x++) {
	for(int y = 0;y<3;y++) {
		System.out.print("   "+arr[x][y]);
	}
	System.out.println();
}

System.out.println("Diagonal of  the  matrix");

for (int x = 0;x<3;x++) {
	for(int y = 0;y<3;y++) {
		if (x == y) {
			System.out.print("   "+arr[x][y]);
		}
	}
	System.out.println();
}

System.out.println("Transpose of the matrix");

for (int x =0 ;x<3;x++) {
	for (int y = 0;y<3;y++) {
			System.out.print(" "+arr[y][x]);
		}
	System.out.println();
}
	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	int arr[][] = new int [3][3];
	System.out.println("Enter some values: ");
	for(int x = 0;x<3;x++) {
	  for (int y = 0;y<3;y++) {
		  arr [x][y] = scan.nextInt();
	
		}
		}
	System.out.println(" Here  is  the  matrix");
	for (int x = 0;x<3;x++) {
		for(int y = 0;y<3;y++) {
			System.out.print("   "+arr[x][y]);
		}
		System.out.println();
	}
	
	System.out.println("Diagonal of  the  matrix");
	
	for (int x = 0;x<3;x++) {
		for(int y = 0;y<3;y++) {
			if (x == y) {
				System.out.print("   "+arr[x][y]);
			}
		}
		System.out.println();
	}
	
	System.out.println("Transpose of the matrix");
	
	for (int x =0 ;x<3;x++) {
		for (int y = 0;y<3;y++) {
				System.out.print(" "+arr[y][x]);
			}
		System.out.println();
	}
		}
}
