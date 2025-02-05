package studio3;

import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("All prime numbers up to: ");
		int n = in.nextInt();
		
		boolean[] array = new boolean[n];
		for(int i = 0; i < n; i++) {
			array[i] = true;
			}
		
		for(int i = 2; i < n; i++) {
			for(int p = i; p < n; p = p + i) {
				if(p != i) {
					array[p] = false;
				}
			}
		}
		
		for(int i = 2; i < n; i++) {
			System.out.println(array[i]);
			if(array[i] == true) {
				System.out.println(i);
			}
		}
		
		
		
		}
		
		
		
		
	}


