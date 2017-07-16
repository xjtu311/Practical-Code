package test;

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			double sum = 0;
					for (int i = 1; i <= n; i++) {
						sum += 1.0/i;
					}
			System.out.println(new java.text.DecimalFormat("#.0000").format(sum));
		}
	}

}