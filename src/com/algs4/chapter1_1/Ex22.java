package com.algs4.chapter1_1;

public class Ex22 {

	private static int depth = 0;
	public static int rank(int key, int[] a) {
		return rank (key, a, 0, a.length - 1);
	}
	
	public static int rank (int key, int []a, int lo, int hi) {
		for (int i = 0; i < depth; i++)
			System.out.print ("  ");
		System.out.printf ("lo=%d hi=%d\n", lo, hi);
		depth++;
		if (lo > hi) return -1;
		

		int mid = lo + (hi -lo) / 2;
		if (key < a[mid])     	return rank (key, a, lo, mid - 1);
		else if (key > a[mid])  return rank (key, a, mid + 1, hi);
		else 					return mid;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key;
		int []a = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		key = rank (7,a);
		System.out.printf ("key=%d\n",key);
	}

}
