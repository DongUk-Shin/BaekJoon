package saessag;

import java.util.Scanner;

class B10951 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();


		while(sc.hasNextInt()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}	
		sc.close();
	}
}