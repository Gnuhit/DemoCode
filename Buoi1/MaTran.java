// Ngô Minh Hùng - 2280601103 - 22DTHB4

import java.util.Scanner;

public class MaTran {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out. print ("Hấy nhập ma trận m dòng và n cột: ");
	  int m =sc.nextInt();
	  int n = sc.nextInt();		 
	  int [][]a = new int [m][n];
		for (int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=(int) (Math.random ()*10000);
			}
		}
          for (int i=0;i<m;i++){
              for(int j=0;j<n;j++){
                  System.out.format("|%8d", a[i][j]);
              }
              System.out.println();
          }
	}
}