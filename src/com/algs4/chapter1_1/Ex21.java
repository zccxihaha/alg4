package com.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []a = new String [100];
		int[]b = new int[100];
		int[]c = new int[100];
		int count = 0;
		
		System.out.printf ("Please input content:\n");
		while (!StdIn.isEmpty()) 
		{
			a[count] = StdIn.readString ();
			b[count] = StdIn.readInt ();
			c[count] = StdIn.readInt ();
			count++;
		}
		
		for (int i = 0; i < count; i++) 
		{
			System.out.printf ("name %s get %d %.3f\n", a[i], b[i], (float)((float)b[i]/c[i]));
		}
		

	}

}
